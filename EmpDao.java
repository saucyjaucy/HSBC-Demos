package com.hsbc.layered;

public class EmpDao implements EmpDaoIntf {
	
	private Emp[] arr = new Emp[3];   //data store

	public EmpDao() {
		arr[0] = new Emp(101,"aaa");
		arr[1] = new Emp(102,"bbbb");
		arr[2] = new Emp(103,"ccc");
	}
	
	public Emp[] getAllEmps() {
		return arr;
	}
	
	public Emp getEmpWithId(int id) {
		
		Emp foundemp = null;
		
		for(Emp e : arr) {
			if(e.getEmpId() == id) {
				System.out.println("Id found!");
				foundemp = e;
				//break;
			}
		}
		return foundemp;
	}

	public void getEmpByName(String name) {
		for(Emp e : arr) {
			if(e.getEmpName().equals(name)) {
				System.out.println("Name found!");
				break;
			}
		}
	}
	
	public void updateName(int id, String newName) {
		for(Emp e : arr) {
			if(e.getEmpId() == id) {
				System.out.println("Id found!");
				e.setEmpName(newName);
				break;
			}
		}
	}
}
