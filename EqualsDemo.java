package com.trg.fundamentals;


public class EqualsDemo {
	public static void main(String args[])
	{
		Employee e1 = new Employee(1001,"Harry",25000.0,"Manager");
		Employee e2 = new Employee(1001,"Harry",25000.0,"Manager");
		Employee e3 = e2;
		System.out.println(e1==e2);
		System.out.println(e1.equals(e2));
		System.out.println(e3==e2);
		System.out.println(e3.equals(e2));
	}
}
