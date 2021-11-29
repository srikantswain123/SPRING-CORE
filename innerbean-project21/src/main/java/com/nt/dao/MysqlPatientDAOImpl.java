package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import com.nt.bo.PatientBO;

public class MysqlPatientDAOImpl implements PatientDAO {
	private final static String PATIENT_REGIS="INSERT INTO PATIENT_REGIST(PNAME,PAGE,PADD,STAY,AMT) VALUES(?,?,?,?,?)";
	private DataSource ds;
	

	public MysqlPatientDAOImpl(DataSource ds) {
		this.ds = ds;
	}


	@Override
	public int register(PatientBO bo) throws Exception {
		int count =0;
		Connection con=null;
		PreparedStatement ps=null;
		con=ds.getConnection();
		ps=con.prepareStatement(PATIENT_REGIS);
		ps.setString(1, bo.getPname());ps.setInt(2, bo.getPage());ps.setString(3, bo.getPaddr());ps.setInt(4, bo.getDays());ps.setFloat(5,bo.getTotalAmt());
		count=ps.executeUpdate();		
		
		return count;
	}

}
