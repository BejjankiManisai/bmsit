package com.bmsit;

import java.util.ArrayList;
import java.util.List;

public class Salary implements Subject 
{
	private List<Employees> pays = new ArrayList<>();
	String title;
	
	private Observer sal;
	
	@Override
	public void Employee(Employees pay)
	{
		pays.add(pay);	
	}
	
	@Override
	public void unEmpolyee(Observer pay)
	{
		pays.remove(pay);
	}
	@Override
	public void notifyEmployees()
	{
		for(Observer pay : pays) 
		{
			pay.update();
		}
	}
	@Override
	public void upload(String title)
	{
		this.title = title;
		notifyEmployees();
	}
}
