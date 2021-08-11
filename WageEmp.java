package com.hsbc.inheritance;


public class WageEmp extends Emp{
	
	private int hrs, rate;
	
	public WageEmp(int empid, String ename, int hrs, int rate) {
		super(empid, ename);	
		this.hrs = hrs;
		this.rate = rate;
	}
	
     public int calcSal() {
    	 return hrs * rate;
     }
	
     public void m1() {
 		System.out.println("In m1 of WageEmp");
 	}
     
	public static void main(String[] args) {
		WageEmp we1 = new WageEmp(101,"Saket",80,1500);
		we1.displayEmpDetails();
		System.out.println("Sal is : " + we1.calcSal());
		
	}
}
