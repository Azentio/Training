package pack06;

import java.util.Scanner;

public class Person
{
	public static void work()
	{	
		
	System.out.println("Person works hard.");
	
	}
	public static void walk()
	{	
		
	System.out.println("Person is gone for walk.");
	
	}
	public static void travel()
	{
		System.out.println("Person is travelling.");
	}

public static void main(String[] args)
{
	Scanner s=new Scanner(System.in);
	System.out.println("Please enter your name: ");
	String name= s.nextLine();
	System.out.println("New employee "+name+" is now registered in the portal.");
	work();
	walk();
	travel();
	Employee e=new Employee();
	e.work();
	e.walk();
	e.travels();

}
}