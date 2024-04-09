package com.sunbeam;

import java.util.Scanner;

public class HourlyEmployee extends Employee {

	private int wage;
	private int hours;

	@Override
	public void acceptData()
	{
		Scanner sc=new Scanner(System.in);
		super.acceptData();
		System.out.println("wage");
		wage=sc.nextInt();
		System.out.println("hours:");
		hours=sc.nextInt();
		
	}
	@Override
	public void displyData() 
	{
		
		super.displyData();
		System.out.println("total salary of hourly Employee:");
		
	}

	@Override
	public void calculateSalary()
	{
    int totalsalary = 0;
		if (hours <= 40) {
			totalsalary=wage * hours;
		} 
		else if (hours > 40)
		{
			totalsalary=(int) (40 * wage + (hours - 40) * wage * 1.5);
		}
		System.out.println("total salary is :"+totalsalary);

	}

	public int getWage() {
		return wage;
	}

	public void setWage(int wage) {
		this.wage = wage;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

}
