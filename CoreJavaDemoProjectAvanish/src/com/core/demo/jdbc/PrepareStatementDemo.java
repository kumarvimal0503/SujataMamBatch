package com.core.demo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PrepareStatementDemo {
	public static void main(String[]rgs) {
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = 
					"jdbc:mysql://localhost:3306/test";
			conn = DriverManager.getConnection(url,"root","root");

			System.out.println("Connection Established: "+conn); 
			
			//DatabaseMetaData dbData = conn.getMetaData();
			//dbData.

			PreparedStatement stmnt = conn.prepareStatement("select * from user where user_name = ?");

			stmnt.setString(1, "vimal");

			ResultSet rs = stmnt.executeQuery();
			
			//rs.getMetaData();
			
			

			while(rs.next()) {
				String userName = rs.getString("user_name");
				String name = rs.getString("name");
				String pass = rs.getString("pass");
				System.out.println("UserName: "+ userName);
				System.out.println("Name: "+ name);
				System.out.println("Pass: "+pass);
			}



		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			if(conn != null)
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}

	}
}