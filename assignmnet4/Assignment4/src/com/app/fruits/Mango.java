package com.app.fruits;

import java.util.Scanner;

public class Mango extends Fruit
{

	public Mango()
	{
		super("Mango","Yellow",true);
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
    	
    	return "sweet";
    }

}
