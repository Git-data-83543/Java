//Create an application that calculates your daily driving cost, so that you can estimate how much
//money could be saved by car pooling, which also has other advantages such as reducing carbon
//emissions and reducing traffic congestion. The application should input the following information
//and display the user’s cost per day of driving to work:
//a) Total miles driven per day.
//b) Cost per gallon of gasoline.
//c) Average miles per gallon.
//d) Parking fees per day.
//e) Tolls per day.










package com.sunbeam;

import java.util.Scanner;

public class DrivingCost {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter toral miles driven per day");
		int TotalMilesDrivenPerDay=sc.nextInt();
		
		System.out.println("Enter the cost per gallon of gasoline");
		int CostGallonOfGasolin=sc.nextInt();
		
		System.err.println("Enter qverage miles per gallo");
		int AvgMilesPerGallon=sc.nextInt();
		
		System.out.println("Enter thr parking fees per daye:");
		int ParkingFees=sc.nextInt();
		
		System.out.println("Enter tolls per day");
		int TollsPerDay=sc.nextInt();
		
		int TotalCost;
		TotalCost = (TotalMilesDrivenPerDay/AvgMilesPerGallon) * CostGallonOfGasolin;
		int tolls = 0;
		TotalCost= TotalCost + ParkingFees + tolls;
		System.out.println("display users cost per day :" + TotalCost);
	
	
		
	
	}

}
