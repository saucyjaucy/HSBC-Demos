package com.hsbc.inheritance;


public class SalesEmp extends WageEmp{

	private int comm;

	public SalesEmp(int empid, String ename, int hrs, int rate, int comm) {
		super(empid, ename, hrs, rate);
		this.comm = comm;
	}
	
	
	//method overriding  --> Dynamic polymorphism
	 public int calcSal() {
		 return comm + super.calcSal();
	 }
	
	 /*public void m1() {
			System.out.println("In m1 of SalesEmp");
		}*/
	 
	public static void main(String[] args) {
		SalesEmp se1 = new SalesEmp(1001, "Anu", 10, 1200, 5000);
		System.out.println(se1.calcSal());
		se1.displayEmpDetails();
		
		System.out.println(((Emp)se1) instanceof Emp);
		
		((Emp)se1).m1();
	}
}









