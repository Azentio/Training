package assignment_third;

import java.util.Scanner;

public class Integer_Division 
{
	void m1() 
	{  	System.out.println("Enter number");
		Scanner s=new Scanner(System.in);
		int num = s.nextInt();
	
		int data = num/0;
	}
	void m2()
	{
		try {
				m1();

			}
		catch(ArithmeticException e)
		{
			System.out.println("divison with zero not possible");
		}
	}

	public static void main(String[] args) 
	{
		Integer_Division i = new Integer_Division();
		i.m2();
	}

}
