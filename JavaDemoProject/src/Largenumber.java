
import java.util.Scanner;

public class Largenumber {
	
	private static Scanner sc;
	
	public static void main(String[] args) 
	{
		int no1, no2;
		sc = new Scanner(System.in);
		
		System.out.print(" Please Enter the First Number : ");
		no1 = sc.nextInt();	
		
		System.out.print(" Please Enter the Second Number : ");
		no2 = sc.nextInt();	
		
		if(no1 > no2) 
	    {
			System.out.println("\n The Largest Number = " + no1);          
	    } 
	    else if (no2 > no1)
	    { 
	    	System.out.println("\n The Largest Number = " + no2);        
	    } 
	    else 
	    {
	    	System.out.println("\n Both are Equal");
	    }		
	}	
}