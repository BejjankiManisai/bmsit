package com.bmsit;

public class Employees implements Observer {
	
	private String name;
	private Salary salary = new Salary();
	
	
	
	public Employees(String name) {
		super();
		this.name = name;
	}

	@Override
	public void update()
	{
		System.out.println("Hey " + name + ", Amount Credited : " + salary.title);
	}
	
	@Override
	public void employeesSalary(Salary sa)
	{
		salary = sa;
	}
}
