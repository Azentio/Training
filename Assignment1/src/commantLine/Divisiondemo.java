package commantLine;

public class Divisiondemo {

	public static void main(String args[]) {
		int b=10;
		int a = 0;
		try {
		a=b/Integer.parseInt(args[0]);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception reason is:"+e.getMessage());
		}
		System.out.println(a);

	}
}
