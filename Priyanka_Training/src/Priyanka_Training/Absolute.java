package Priyanka_Training;

public class Absolute 
{	
	static void xyz(int value)
	{
		int result = (value<0) ? (value*=-(1)):(value);
		System.out.println(result);
				
	}
	
	public static void main(String[] args) 
	{
		Absolute obj = new Absolute ();
		xyz(-12);

	}

}
