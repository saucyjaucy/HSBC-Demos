package com.hsbc.layered;

public class TestEmpDao {
	
	public static void main(String[] args) {
		EmpDao dao = new EmpDao();
		Emp[] arr = dao.getAllEmps();
		for(Emp e : arr) 
			e.displayEmpDetails();
		
		System.out.println(dao.getEmpWithId(101));
		
		dao.getEmpByName("bbbb");
		
		dao.updateName(103, "Aditya");
		
		Emp[] arr1 = dao.getAllEmps();
		for(Emp e : arr1) 
			e.displayEmpDetails();
	}

}
