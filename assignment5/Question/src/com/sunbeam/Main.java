package com.sunbeam;

import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Employee e=null;
		BaseplusCommissionEmployee b;//reference
		//e =new SalarisedEmployee();
		//e=new HourlyEmployee();
		//e=new CommissionEmployee();
		//e=new BaseplusCommissionEmployee();
		int choice;
		System.out.println("Enter the choice =");
		choice =sc.nextInt();
		if(choice==1)
		{
			e =new SalarisedEmployee();
			e.acceptData();
			e.displyData();
			e.calculateSalary();
			System.out.println("**********************************************************************************");
			
		}
		
		else if(choice==2)
		{
			e=new HourlyEmployee();
			e.acceptData();
			e.displyData();
			e.calculateSalary();
			System.out.println("****************************************************************************************");
		}
	
		else if(choice==3)
		{
			e=new CommissionEmployee();
			e.acceptData();
			e.displyData();
			e.calculateSalary();
			System.out.println("************************************************************************************");
		}
		else if(choice==4)
		{
			e=new BaseplusCommissionEmployee();
			e.acceptData();
			e.displyData();
			e.calculateSalary();
			System.out.println("*************************************************************************************");
		}
		
		else if(choice==5)
		{
			 e=new BaseplusCommissionEmployee();
			 e.acceptData();
			 e.displyData();
			 if(e instanceof BaseplusCommissionEmployee)
			 {
				 b=(BaseplusCommissionEmployee)e;
				 b.reward();
			 }
		}
		

	}
}

