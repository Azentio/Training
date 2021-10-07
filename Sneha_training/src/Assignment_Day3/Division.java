package Assignment_Day3;

import java.util.Scanner;

public class Division {
	void dv() 
	{  	System.out.println("Enter number");
		Scanner s=new Scanner(System.in);
		int num = s.nextInt();
	
		try {
				
			int data = num/0;
			}
		catch(ArithmeticException e)
		{
			System.out.println("divison with zero not possible");
		}
	}

	public static void main(String[] args) 
	{
		Division dvs = new Division();
		dvs.dv();
	}
}
