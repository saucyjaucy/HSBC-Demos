package com.hsbc.layered;


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

	//incrSal()
	//promoteEmp()
	
	
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	
}
