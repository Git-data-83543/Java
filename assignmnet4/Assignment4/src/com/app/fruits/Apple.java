package com.app.fruits;

import java.util.Scanner;

public class Apple extends Fruit{

	public Apple() 
	{
	super("Apple","RED",true);
		
	}
	public void accept(Scanner sc)
	{
		super.accept();
	}
	public void display()
	{
		super.display();
	}
@Override
public String taste() {
	
	return "sweet n sour";
}

	
}
