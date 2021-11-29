package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.nt.bo.PoliticianBo;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public final class PoliticianDaoImpl implements PoliticianDao {
	// prepare sql query
	private static final String POLITICIAN = "SELECT NAME,AGE,ADDRESS,PARTY,DESG FROM POLITICIAN";
	// DataSource
	@NonNull
	private DataSource ds;

	@Override
	public List<PoliticianBo> getPoliticianDetails() throws Exception {
		List<PoliticianBo> listBo = null;
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		PoliticianBo bo = null;

		try {
			// get Connection Poll
			con = ds.getConnection();
			// prepare precompile sql query
			if (con != null)
				ps = con.prepareStatement(POLITICIAN);
			// prepare ResultSet Obj
			if (ps != null)
				rs = ps.executeQuery();
			// create ListBo Object
			listBo = new ArrayList();
			if (rs != null) {
				while (rs.next()) {
					bo = new PoliticianBo();
					bo.setName(rs.getString(1));
					bo.setAge(rs.getInt(2));
					bo.setAddrs(rs.getString(3));
					bo.setParty(rs.getString(4));
					bo.setDesg(rs.getString(5));
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

}// class
