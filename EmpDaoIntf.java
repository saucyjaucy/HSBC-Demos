package com.hsbc.layered;

public interface EmpDaoIntf {

	public Emp[] getAllEmps();
	
	public Emp getEmpWithId(int id);

	public void getEmpByName(String name);

	public void updateName(int id, String newName);

}
