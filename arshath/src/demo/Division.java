package demo;

public class Division {

	public static void main(String args[]) {
		  int a = 0;
		  int b = 20;
		  try {
			  a=b/a+b;
		   System.out.println("This line will not be Executed");
		  } 
		  catch (ArithmeticException e) 
		  {
		   System.out.println(" Exception is = " + e);
		  }
		  System.out.println("End Of Main");
		 }
		}

