package com.hsbc.inheritance;


public class Emp {
	private int empId;
	private String empName;
	
	public Emp(int empId, String empName) {
		this.empId = empId;
		this.empName = empName;
	}

	public Emp() {}
	
	public void displayEmpDetails() {
		System.out.println( "Emp [empId=" + empId + ", empName=" + empName + "]");
	}
	
	public void m1() {
		System.out.println("In m1 of Emp");
	}

}
