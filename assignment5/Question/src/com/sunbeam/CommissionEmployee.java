package com.sunbeam;

import java.util.Scanner;

public class CommissionEmployee extends Employee {
	
	      private int sale;
	      private double rate;
	      
	     @Override
	    public void acceptData() 
	     
	  {
	    	 Scanner sc=new Scanner(System.in);
	    	 super.acceptData();
	    	 System.out.println("Enter the sale:");
	    	 sale=sc.nextInt();
	    	 System.out.println("Entetr the rate:");
	    	 rate=sc.nextDouble();
	    	 
	    
	    
	    }
	      
	      

	@Override
	public void displyData()
	{
	
	   super.displyData();
	   System.out.println("Total salary of commission employee:");
	   
	   
	
		
	}

	@Override
	public void calculateSalary() 
	{
		int totalsalary;
		totalsalary=(int) (rate*sale);
		System.out.println("Total salary is:"+totalsalary);
				
	
		
	}




	

}
