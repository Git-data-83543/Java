package com.sunbeam;

import java.util.Scanner;

public class BaseplusCommissionEmployee extends Employee 
{
	private int sale;
	private double rate;
	private double basesalary;

	@Override
	public void acceptData() {
		Scanner sc=new Scanner(System.in);
		super.acceptData();
		 System.out.println("Enter the sale:");
    	 sale=sc.nextInt();
    	 System.out.println("Entetr the rate:");
    	 rate=sc.nextDouble();
    	 System.out.println("Enter the base salary:");
    	 basesalary=sc.nextDouble();
    	 
	}
	@Override
	public void displyData() {
		
		super.displyData();
		System.out.println("Total salarey of Base commission Employee:");
		
	}

	@Override
	public void calculateSalary()
	{
		System.out.println("net salary"+((rate*sale)+basesalary));
		int totalsalary;
		totalsalary=(int) ((rate*sale)+basesalary);
	}
public void reward()
{
	System.out.println("NET Salary"+((rate*sale)+basesalary+basesalary*0.1));
}
	

	}
