package com.shekhar.jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PreparedStatementDemo {

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
			
			PreparedStatement statement = conn.prepareStatement("select * from student");
			
			ResultSet resultSet = statement.executeQuery();
			
			while(resultSet.next()) {
				
				System.out.println("ROll: "+resultSet.getString("roll_no"));
				System.out.println("Name: "+resultSet.getString("name"));
			}
			
			statement.executeUpdate("insert into student values ('17','Shekhar','17','Java','GENERAL')");
			
			resultSet = statement.executeQuery("select * from student");
			
			while(resultSet.next()) {
				
				System.out.println("ROll: "+resultSet.getString("roll_no"));
				System.out.println("Name: "+resultSet.getString("name"));
			}
			resultSet.close();
			
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
