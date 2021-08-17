package com.hsbc.jdbc.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DeptDao2 {

	Connection conn = null;

	DeptDao2() {
		conn = DBConnection.getConnection();
	}

	public void addDept(Dept d) {
		Statement stmt;
		try {
			stmt = conn.createStatement();
			int i = stmt.executeUpdate(
					"insert into dept values(" + d.getDeptno() + ", '" + d.getDname() + "',' " + d.getLoc() + "')");

			if (i > 0) {
				System.out.println("Insertion Sucessful!");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void deleteDept(int deptno) {
		Statement stmt;
		try {
			stmt = conn.createStatement();
			int i = stmt.executeUpdate("delete from dept where deptno=" + deptno);
			if (i > 0) {
				System.out.println("Deletion Sucessful!");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public List<Dept> getAllDepts() {
		ArrayList<Dept> arrli = new ArrayList<>();
		
		Statement stmt;
		try {

			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("Select * from dept");
			rs.next();
			while (rs.next()) {
				arrli.add(new Dept(rs.getInt(1), rs.getString(1), rs.getString(2)));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return arrli;

	}

	public static void main(String[] args) {
		DeptDao2 dao = new DeptDao2();
		Dept dept = new Dept(99, "NEW DEPT", "NEW LOC");
		// dao.addDept(dept);
		dao.deleteDept(99);

		List<Dept> l = dao.getAllDepts();
		
		for(Dept d : l)
			System.out.println(d);

	}

}
