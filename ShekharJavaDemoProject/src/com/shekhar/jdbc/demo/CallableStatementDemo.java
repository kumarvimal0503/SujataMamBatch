package com.shekhar.jdbc.demo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;


public class CallableStatementDemo {

	public static void main(String[] args) {
		Connection conn  = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Class loaded");
			String url = "jdbc:mysql://localhost:3306/test";
			String userName = "root";
			String pass = "root";
			conn  = DriverManager.getConnection(url, userName, pass);
			System.out.println("Connection Estalished");
			
			CallableStatement ps = conn.prepareCall("{call sum4(?,?,?)}");
			ps.setInt(1, 10);
			ps.setInt(2, 20);
			ps.registerOutParameter(3, Types.INTEGER);
			ps.execute();
				System.out.println(ps.getInt("result"))	;
			
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
