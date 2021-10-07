package assignment3;

import java.util.Scanner;

public class multiExceptions 
{
	public void divi() 
	{
		int n;
		System.out.println("Please enter a number to be divided");
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		n = n / 0;
	}
{
	try 
	{
		divi();
	}
	catch(ArithmeticException e) 
	{
		System.out.println("Cannot divide by zero");
	}
}
	public static void main(String[] args) 
	{
		multiExceptions mul = new multiExceptions();

	}
}