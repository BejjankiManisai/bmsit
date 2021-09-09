package com.bmsit;

public class bmsitIndustries {
	
	public static void main(String[] args)
	{
		
		Salary bmsit = new Salary();
		
		Employees s1 = new Employees("Paul");
		Employees s2 = new Employees("Jessi");
		Employees s3 = new Employees("Kiran");
		Employees s4 = new Employees("Praveen");
		Employees s5 = new Employees("Aravind");
		
		bmsit.Employee(s1);
		bmsit.Employee(s2);
		bmsit.Employee(s3);
		bmsit.Employee(s4);
		bmsit.Employee(s5);
			
		s1.employeesSalary(bmsit);
		s2.employeesSalary(bmsit);
		s3.employeesSalary(bmsit);
		s4.employeesSalary(bmsit);
		s5.employeesSalary(bmsit);
		
		bmsit.upload("Your Salary for this Month got credited into your respective bank account");
		
	}

}
