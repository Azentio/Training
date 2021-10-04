package Priyanka_Training;

import java.util.Scanner;

public class Grade 
{

	public static void main(String[] args) 
	{
		System.out.println("Enter Your Marks");
		Scanner s=new Scanner(System.in);
		int marks=s.nextInt();
		
		
		if(marks<0 || marks>100)
			{
				System.out.println("Invaild");
			}
		 else if(marks<50)
		    {
		       System.out.println("Fail");
		    }
		 else if(marks>=50 && marks<80)
		    {
		     System.out.println("Grade C");
		    }
		 else if(marks>=80 && marks<90)
		    {
		     System.out.println("Grade B");
		    }
		
		 else
		    {
		      System.out.println("Grade A");
		    }

		

	}

}
