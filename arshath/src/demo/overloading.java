package demo;

public class overloading {
	
public void load(int a,int b) {
	
	System.out.println("Result is :" +(a+b));
}

   public int load(int a,int b,int c)
{
	int d=a+b+c;
	System.out.println("Result is :" +d );
	return d;
}
	
	public static void main(String[] args)
	{
		overloading a=new overloading();
	a.load(10, 10);
	a.load(4, 7, 7);
	}
}