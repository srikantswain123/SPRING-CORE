package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.nt.bo.CustomerBO;

@Repository("dao")
public class CustomerDAOImpl implements CustomerDAO {
	private static final String CUSTOMER_REGIST="INSERT INTO CUSTOMER_REGIST VALUES(SEQ_NO.NEXTVAL,?,?,?,?)";
	@Autowired
	@Qualifier("hids")
	private DataSource ds;

	@Override
	public int insert(CustomerBO bo) throws Exception {
		Connection con=null;
		con=ds.getConnection();
		PreparedStatement ps=null;
         int count=0;
		ps=con.prepareStatement(CUSTOMER_REGIST);
          ps.setString(1,bo.getCname());ps.setString(2, bo.getCadd());ps.setFloat(3, bo.getPamt());ps.setFloat(4, bo.getInterset());	
		
		count=ps.executeUpdate();
		
		
		return count;
	}

}
