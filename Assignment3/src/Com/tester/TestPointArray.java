package Com.tester;

import java.util.Scanner;
import com.geometry.*;                                                                                                                                                                        

public class TestPointArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of elements to plot:");
		
		int no=sc.nextInt();
		Point2D p[]=new Point2D[no];
		
		for(int i=0;i<p.length;i++) {
			p[i]=new Point2D();
			p[i].accept();
			
		}
		int choice;
		do {
		
			
			
			System.out.println("0.Exit");
			System.out.println("1.Display details of specific point");
			System.out.println("2.Display x y co-ordinates of each point ");
			System.out.println("3.User i/p 2 indices for the points validate the indices");
			
			System.out.println("Enter the choice ");
			choice=sc.nextInt();
			switch(choice) {
			case 0:
			System.out.println("Thank you");
			break;
			case 1:
			{
				int index;
				System.out.println("Enter the index:");
				index=sc.nextInt();
				if(index>0)
					System.out.println(p[index].getDetails());
				else 
					System.out.println("Invalisd index pls retyr ");
				
				}
			break;
			case 2:
			{
				for(Point2D element:p)
					System.out.println("element"+element.getDetails());
				
			}
			break;
			case 3:
			{
				int i1,i2;
				System.out.println("Enter index of strt point n end point");
				i1=sc.nextInt();
				i2=sc.nextInt();
				
				int len=p.length;
				
				if(i1<0&&i1>no-1) {
					System.out.println("invalid choice");
					
				}
				if(i2<0&&i2>no-1) {
					System.out.println("invalid choice");
				}
				else {
					System.out.println("points are at different location");
					System.out.println("cordinates at i1 x and y:"+p[i1].getDetails());
					System.out.println("coordinate at i2 x and y:"+p[i2].getDetails());
					Double distance=p[i1].calculateDistance(p[i2]);
					System.out.println("disatance is"+distance);
					
				}
				break;
			}
			default:
			 System.out.println("Enter incoerresct choice:");
			 break;
			
			}
			
		}while(choice!=0);
	}

}
