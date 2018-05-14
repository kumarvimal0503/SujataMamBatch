package com.shekhar.jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

public class PreparedStatement2 {

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
			
			List<String> rollArray = Arrays.asList("14","16","17","Vimal");
			
			System.out.println("****************************************************");
			
			
			PreparedStatement ps = conn.prepareStatement("select * from student where roll_no = ?");
			
			//Statement st = conn.createStatement();
			long startTime = System.currentTimeMillis();
			for (String rollNo : rollArray) {
				ps.setString(1, rollNo);
				ResultSet rs = ps.executeQuery();
				//ResultSet rs = st.executeQuery("select * from student where roll_no = '"+rollNo+"'");
				if(rs.next())
					System.out.println("Name: "+rs.getString("name"));
			}
			long endTime = System.currentTimeMillis();
			
			System.out.println("Difference: "+(endTime - startTime));
			
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
