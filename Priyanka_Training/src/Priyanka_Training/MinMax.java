package Priyanka_Training;

import java.util.Scanner;

public class MinMax 
{

	public static void main(String[] args) 
	{
		int a[]=new int[8];
		Scanner s=new Scanner(System.in);
		System.out.println("enter elements");
		
		for (int i=0; i<a.length; i++)
		{
			a[i]=s.nextInt();
		}
		
		
		System.out.println("finding min and max");
		
		int min=a[0];
		for(int i=0; i<a.length; i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println(min+ "min value");
		
		
		int max=a[0];
		for(int i=0; i<a.length; i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println(max+ "min value");


	}

}
