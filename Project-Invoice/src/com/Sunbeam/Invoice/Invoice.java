package com.Sunbeam.Invoice;

public class Invoice {
	private String pnum;
	private String pdes;
	private int qty;
	private double price;
	 

	public Invoice(){
		 this("","",0,0.0);
     }
	 public Invoice(String pnum,String pdes,int qty,double price)
	 {
		 this.pnum=pnum;
		 this.pdes=pdes;
		 this.qty=qty;
		 this.price=price;
		 
	 }
	 public void setpnum(String pnum)//settor
	 {
		 this.pnum=pnum;
	 }
	 public String getpnum()//getter
	 {
		 return pnum;
		 
	 }
	 public void setpdes(String pdes)//settor
	 {
		 this.pdes=pdes;
	 }
	 public String getpdes()//gettor
	 {
		 return pdes;
	 }
	public void setqty(int qty)//settor
	{
		if(qty<0)
		{
			qty=0;
		}
	
	     this.qty=qty;
	}
	public int getqty()//gettor
	{
		return qty;
		
	}
  public void setprice(double price)//settor
	{
	  if(price<0)
	  {
		  price=0.0;
	  }

				 this.price=price;
	}
    public Double getprice()//gettor
    {
    	return price;
    }
    public double CalculateInvoice()
    {
    	return price*qty;
    }
    
}