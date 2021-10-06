package pack06;
import java.util.Scanner;

public class Division 
{
	public void div()
	{
	 int n;
	 System.out.println("Please enter a number to be divided");
	 Scanner s=new Scanner(System.in);
	 n=s.nextInt();
	 n=n/0;
	}

	{
        try
        {
        	div();
        }
        
        catch (ArithmeticException e) 
        {
            System.out.println("Cannot be divided by zero");
        }
        
 
    }
	
	public static void main(String[]args)
	{
	 Division d=new Division();
	}
 

}
