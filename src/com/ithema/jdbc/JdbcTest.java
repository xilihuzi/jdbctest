package com.ithema.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Test;

public class JdbcTest {
	@Test
	public void testSql(){
		System.out.println("haha");
//		String driver="com.microsoft.jdbc.sqlserver.SQLServerDriver";
//		String url="jdbc:microsoft:sqlserver://127.0.0.1:1433;DatabaseName=CMS"; 
		String driver="net.sourceforge.jtds.jdbc.Driver";
		String url="jdbc:jtds:sqlserver://127.0.0.1:1433;DatabaseName=CMS"; 

		try {   
			Class.forName(driver);
			Connection conn=DriverManager.getConnection(url,"sa","123456");
			PreparedStatement pstmt=conn.prepareStatement("select * from T_Abnormal");
			ResultSet rs=pstmt.executeQuery();
			while(rs.next()){
				System.out.println(rs.getString("AbnormalInfo"));
				System.out.println("<br>");
			}
			rs.close();
			pstmt.close();
			conn.close();
		} catch (ClassNotFoundException e) {   
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} 
	}
}
