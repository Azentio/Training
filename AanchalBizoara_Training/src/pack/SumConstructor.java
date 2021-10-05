package pack;

public class SumConstructor 
{
	
	int sum,a=200,b=234;
	
	public SumConstructor(int s)
	{
		this.sum=s;
	}
	
	public SumConstructor()
	{
	
	}
	
	
	public void sum()
	{
		sum=a+b;
		System.out.println("Sum is "+sum);
	}
	
}
