package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.nt.bo.CelibrityBo;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public final class CelebrityDaoImpl implements CelibrityDao {
	// prepared sql query
	private static final String CELEBRITYQUERY = "SELECT CNAME,CADDR,CDOB,SPOUSE,CHILD FROM CELEBRITY";
	@NonNull
	private DataSource ds;

	@Override
	public List<CelibrityBo> getCelebrityDetails() throws Exception {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<CelibrityBo> listBo = null;
		CelibrityBo bo = null;
		java.sql.Date dob = null;
		SimpleDateFormat sdf = null;
		// create date format for end user understand
		sdf = new SimpleDateFormat("dd-MMM-yyyy");
		// create listBo Object
		listBo = new ArrayList();
		try {
			// established polled Connection
			con = ds.getConnection();
			if (con != null)
				ps = con.prepareStatement(CELEBRITYQUERY);
			if (ps != null)
				rs = ps.executeQuery();
			if (rs != null) {
				while (rs.next()) {
					bo = new CelibrityBo();
					bo.setName(rs.getString(1));
					bo.setAddress(rs.getString(2));
					// convert date to String
					bo.setAge(sdf.format(dob = rs.getDate(3)));
					bo.setSpouseName(rs.getString(4));
					bo.setChildrens(String.valueOf(rs.getInt(5)));
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
			}//try
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
		} // try

		return listBo;

	}// method

}// class
