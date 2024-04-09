package com.app.tester;

import java.util.Iterator;

import java.util.Scanner;

import com.app.fruits.Apple;
import com.app.fruits.Fruit;
import com.app.fruits.Mango;
import com.app.fruits.Orange;

public class FruitBasket {

	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int index=0;
		int choice;
		int length;
		System.out.println("Enter the Basket Range=");
		length=sc.nextInt();
		Fruit[] arr=new Fruit[length];
		System.out.println("Array size is : "+arr.length);
		Fruit f=null;//reference
		
		
		do
			{
			System.out.println("0.Exit");
			System.out.println("1.Add mango");
		    System.out.println("2.Add orange");
		    System.out.println("3.Add apple");
		    System.out.println("4.Display names of all fruits in basket");
		    System.out.println("5.Display name color,weight,taste of fruit");
		    System.out.println("6.Display taste of all stale");
	        System.out.println("7.mark a fruit as list");
	        
	       choice=sc.nextInt();
	        
	       
	        
	        
	        switch(choice)
	        {
	        case 0:
	        	System.out.println("Exit");
	        	break;
	        
	        case 1:
	        	System.out.println("add Mango");
	        	if(index<length)
	        	{
	        		f=new Mango();
	        		f.accept();
	        		System.out.println("Index before adding : "+index);
	        		arr[index]=f;
	        		
	        		index++;
	        		System.out.println("Index : "+index);
	        		System.out.println("Array Elements are : "+arr.toString());
	        	}
	        	else 
	        		System.out.println("Basket is full----");
	        	   break;
	        	   
	        case 2:
	        	System.out.println("Add Orange");
	        	 if(index<length)
	        	 {
	                 f=new Orange();
	                 f.accept();
	                 System.out.println("Index before adding : "+index);
	                 arr[index]=f;
	                 index++;
	                 System.out.println("Index : "+index);
	                 System.out.println("Array Elements are : "+arr.toString());
	        	 }
	        	 else
	        		 System.out.println("Basket is full");
	        	 break;
	        case 3:
	        	System.out.println("Add apple");
	        	if(index<length)
	        	{
	        		f=new Apple();
	        		f.accept();
	        		System.out.println("Index before adding : "+index);
	        		arr[index]=f;
	        		index++;
	        		System.out.println("Index : "+index);
	        		System.out.println("Array Elements are : "+arr.toString());
	        	}
	        	break;
	        case 4:
	 //       	if (arr[index]!=null){
	        
	        		for(Fruit e:arr)
	        			if(arr!=null)
	        			System.out.println("Fruit is:"+e.getName());
	        		
	  //      		}else
	   //     		System.out.println("Basket is Empty---!");
	        		break;
	        	
	        case 5:
	        	for(Fruit fruit:arr) {
	        		if(fruit!=null && fruit.isFresh()==true)
	        			System.out.println(fruit);
	        	}
	        	System.out.println("basket is empty---!");
	        	break;
	        case 6:
	        	for(Fruit Fruit:arr){
	        		if(Fruit !=null && Fruit.isFresh()==false)
	        			System.out.println(Fruit);
	        		
	        	}
	        	System.out.println("basket is empty---!");
	        	break;
//	      //  case 7:
//	       // 	int i=0;
//	        	System.out.println("Enter the location="+i);
//	        	i=sc.nextInt();
//	        	if(i<length && arr[i]!=null) {
//	        //		arr[i].setIsfresh(false)
//	        	}else
//	        		System.out.println("Enter The valid range");
//	        	break;
	        	
	        case 8:
	        	break;
	        	
	      
	        
	              
	}
	        
	   }while(choice!=0);
		sc.close();
	}
}

