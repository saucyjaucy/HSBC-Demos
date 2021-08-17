package com.hsbc.jdbc.dao;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;



public class DeptDao {
	
	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/hsbcdb";
		String sql = "select * from dept";
		
		try {
			//1. Load the driver
			//Class.forName(className);
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			
			//2. Obtain connection to DB
			Connection conn = DriverManager.getConnection(url, "root", "root123");
			System.out.println(conn);
			
			//3. craete statement obj
			Statement stmt = conn.createStatement();
			
			//4. Execute this statement
			   ResultSet rs = stmt.executeQuery(sql);
			   
			//5. use rs to see data!
			   while(rs.next()) {
			       System.out.println(rs.getInt(1) + " : " + rs.getString(2) + " : " + rs.getString(3));
			   }
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
