package assignment3;

import java.util.Scanner;

public class multiExceptions 
{
	public void divi() 
	{
		int z;
		System.out.print("Please enter a number to be divided:");
		Scanner scan = new Scanner(System.in);
		z = scan.nextInt();
		z = z / 0;
	}
{
	try 
	{
		divi();
	}
	catch(ArithmeticException p) 
	{
		System.out.println("Catch statment: 'Cannot divide by zero'3");
	}
}
	public static void main(String[] args) 
	{
		multiExceptions mul = new multiExceptions();
		

	}
}