package com.itheima.util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class DataSourceUtils {
	private static ComboPooledDataSource ds=new ComboPooledDataSource();
	
	/**
	 * 鑾峰彇鏁版嵁婧�
	 * @return 杩炴帴姹�
	 */
	public static DataSource getDataSource(){
		return ds;
	}
	
	/**
	 * 鑾峰彇杩炴帴
	 * @return 杩炴帴
	 * @throws SQLException
	 */
	public static Connection getConnection() throws SQLException{
		return ds.getConnection();
	}
	
	
	
	/**
	 * 閲婃斁璧勬簮
	 * 
	 * @param conn
	 *            杩炴帴
	 * @param st
	 *            璇彞鎵ц鑰�
	 * @param rs
	 *            缁撴灉闆�
	 */
	public static void closeResource(Connection conn, Statement st, ResultSet rs) {
		closeResultSet(rs);
		closeStatement(st);
		closeConn(conn);
	}

	/**
	 * 閲婃斁杩炴帴
	 * 
	 * @param conn
	 *            杩炴帴
	 */
	public static void closeConn(Connection conn) {
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			conn = null;
		}

	}

	/**
	 * 閲婃斁璇彞鎵ц鑰�
	 * 
	 * @param st
	 *            璇彞鎵ц鑰�
	 */
	public static void closeStatement(Statement st) {
		if (st != null) {
			try {
				st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			st = null;
		}

	}

	/**
	 * 閲婃斁缁撴灉闆�
	 * 
	 * @param rs
	 *            缁撴灉闆�
	 */
	public static void closeResultSet(ResultSet rs) {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			rs = null;
		}

	}
}
