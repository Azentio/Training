package assignment3;

public class multiExceptions {

	public static void main(String[] args) 
	{
		try 
		{
			int num[] = new int[10];
			num[15] = 100 / 0;
		}
		catch(ArithmeticException  e) 
		{
			System.out.println("Zero cannot divide any number");
		}
		catch(ArrayIndexOutOfBoundsException   e) 
		{
			System.out.println("Index out of size of the array");
		}
	}

}
