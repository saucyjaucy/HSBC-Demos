package com.trg.fundamentals;

import java.util.Arrays;

public class Employee implements Cloneable {
	int empId;
	String ename;
	double sal;
	String desig;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int empId, String ename, double sal, String desig) {
		super();
		this.empId = empId;
		this.ename = ename;
		this.sal = sal;
		this.desig = desig;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public String getDesig() {
		return desig;
	}

	public void setDesig(String desig) {
		this.desig = desig;
	}

	public String toString() {
		return empId + "  " + ename + "  " + sal + "  " + desig;
	}

	public boolean equals(Object otherObject) {
		System.out.println("In equals method");
		// a quick test to see if the objects are identical
		if (this == otherObject)
			return true;
		// must return false if the explicit parameter is null
		if (otherObject == null)
			return false;

		// if the classes don't match, they can't be equal
		// System.out.println(getClass());
		if (getClass() != otherObject.getClass())
			return false;

		// now we know otherObject is a non-null Employee
		Employee other = (Employee) otherObject;
		// test whether the fields have identical values
		return ename.equals(other.ename) && sal == other.sal
				&& desig.equals(other.desig);
	}

	
	/*public boolean equals(Object otherObject){
		Employee e = (Employee)otherObject;
		if(this.sal > e.sal) return true;
		else return false;
	}*/
	public static void main(String args[]) {
		Employee e1 = new Employee(1001, "Harry", 25000.0, "Manager");
		Employee e2 = new Employee(1002, "Harry", 35000.0, "Manager");
		Employee e3 = new Employee(1003, "Harry", 20000.0, "Manager");
		Employee e4 = new Employee(1004, "Harry", 15000.0, "Manager");
		
		Employee arr[] = {e1,e2,e3,e4};
		Arrays.sort(arr);
		for(Employee e : arr){
			System.out.println(e);
		}
		/*
		 * System.out.println(e1==e2); Employee e4=e2;
		 * System.out.println(e2==e4);
		 */

		System.out.println(e1.equals(e2));

		/*try {
			Employee e3;
			e3 = (Employee) e1.clone();
			System.out.println(e3);
		} catch (CloneNotSupportedException e) {

		}*/

	}

	/*
	 * String s1 = "Hello"; String s2 = "Hello";
	 * System.out.println(s1.equals(s2));
	 */

}
