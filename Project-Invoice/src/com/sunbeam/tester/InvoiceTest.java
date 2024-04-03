package com.sunbeam.tester;

import com.Sunbeam.Invoice.Invoice;

class InvoiceTest{
	public static void main(String[] args) {
	 Invoice i=new Invoice("1","Keyboard",4,2000);
	 System.out.println("part number="+i.getpnum());
	 System.out.println("part descreption="+i.getpdes());
	 System.out.println("part quantity="+i.getqty());
	 System.out.println("part price="+i.getprice());
	System.out.println("calculate invoice="+i.CalculateInvoice()); 
	
	 
	 

	}

}
