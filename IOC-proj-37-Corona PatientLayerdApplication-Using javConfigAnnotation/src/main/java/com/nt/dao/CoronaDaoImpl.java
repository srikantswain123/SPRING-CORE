package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;
import javax.sql.DataSource;

import com.nt.bo.CoronaBo;


@Named("dao")
public final class CoronaDaoImpl implements CoronaDao {

	// prepare sql query
	private static final String CORONA = "SELECT PID,PNAME,PAGE,PADDR,STAYING_DAYS,TOTALAMT FROM PATIENT_REGIST";
	// DataSource
     @Inject
	private DataSource ds;

	@Override
	public List<CoronaBo> getCoronaDetails() throws Exception {
		List<CoronaBo> listBo = null;
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		CoronaBo bo = null;

		try {
			// get Connection Poll
			con = ds.getConnection();
			// prepare precompile sql query
			if (con != null)
				ps = con.prepareStatement(CORONA);
			// prepare ResultSet Obj
			if (ps != null)
				rs = ps.executeQuery();
			// create ListBo Object
			listBo = new ArrayList();
			if (rs != null) {
				while (rs.next()) {
					bo = new CoronaBo();
					bo.setPatientId(rs.getInt(1));
					bo.setPatientName(rs.getString(2));
					bo.setAge(rs.getInt(3));
					bo.setAddress(rs.getString(4));
					bo.setStaying_days(rs.getInt(5));
					bo.setTotalAmt(rs.getInt(6));
					// add to list bo
					listBo.add(bo);

				} // while

			} // if

		} // try
		catch (SQLException se) {
			se.printStackTrace();
			throw se;
		} // catch
		finally {
			try {
				if (rs != null)
					rs.close();
			} // try
			catch (SQLException se) {
				se.printStackTrace();
				throw se;
			} // catch
			try {
				if (ps != null)
					ps.close();
			} // try
			catch (SQLException se) {
				se.printStackTrace();
				throw se;
			} // catch
			try {
				if (con != null)
					con.close();
			} // try
			catch (SQLException se) {
				se.printStackTrace();
				throw se;
			} // catch

		} // finally

		return listBo;
	}// method

}
