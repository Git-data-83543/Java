package com.app.fruits;

import java.util.Scanner;

public class Orange extends Fruit
{
	public Orange()
	{
		super("Orange","Orange",true);
	}
	public void accept(Scanner sc)
	{
		super.accept();
		
	}
	public void display()
	{
		
	}
	@Override
	public String taste() {
		
		return "sour";
	}
	
	
	
}

 

