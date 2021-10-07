package assignment_third;

import java.util.Scanner;

public class Integer_Division 
{
	
	int j =5;
	
	 static void m1() 
	{  	System.out.println("Enter number");
		Scanner s=new Scanner(System.in);
		int num = s.nextInt();
	try {
		int data = num/0;
		
		}
 
	   catch(ArithmeticException a)
	{
		System.out.println("divison with zero not possible");
	}
	catch(Exception e)
	   {
		System.out.println("divison with zero not possible");
	   }
	finally {
		System.out.println("ok fine");
	}
	
	
	}
 // main method
	public static void main(String[] args) 
	{
		Integer_Division i = new Integer_Division();
		m1();
	
	 
	}

}
