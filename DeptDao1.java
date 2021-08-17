package com.hsbc.jdbc.dao;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DeptDao1 {
	
	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/hsbcdb";
		//String sql = "insert into dept values(60, 'Training','Pune')";
		//String sql = "delete from dept where deptno > 40";
		String sql = "update dept set loc = 'AUSTIN' where dname = 'OPERATIONS'";
		
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
			   //ResultSet rs = stmt.executeQuery(sql);
			   int i = stmt.executeUpdate(sql);
			   
			   if(i > 0)
				   System.out.println("uPDATE successful!!");
			   
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
