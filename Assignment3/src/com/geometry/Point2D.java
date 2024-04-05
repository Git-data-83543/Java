package com.geometry;

import java.lang.Math;

import java.util.Scanner;

public class Point2D {
	private double x;
	private double y;
	public Point2D()
	{
		x=0.0;
		y=0.0;
		
	}
	public Point2D(Double x,Double y) 
	{
		this.x=x;
		this.y=y;
		
	}
	public double getX() 
	{
		return x;
	}
	public void setX(double x)
	{
		this.x = x;
	}
	public double getY() 
	{
		return y;
	}
	public void setY(double y) 
	{
		this.y = y;
	}
	public String getDetails() 
	{
		String result;
		result="("+x+","+y+")";
		return result;
	}
	public boolean isEqual(Point2D p) 
	{
		
		if(this.x==p.x&&this.y==p.y)
			return true;
		else
		
			return false;
	
		
	}
	
	
	

public double calculateDistance(Point2D p) {
return Math.sqrt(Math.pow(p.x-this.x,2)+Math.pow(p.y-this.y,2));
}
public void accept() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter x and y point to plot");
	x=sc.nextDouble();
	y=sc.nextDouble();
	//point2D[]points=new Point2D[sc.nextInt()];
}
}

