package assignment2;

public class CircleCons {

	double radius,area,sum;
	
	public CircleCons(double radius) 
	{
		this.radius = radius;
	}

	public void getArea() 
	{
		 area= (3.17) * radius * radius;
		 System.out.println("Area= "+ area);
	}
	
	public void sum() 
	{
		sum = area + radius;
		System.out.println(sum);
	}	
	public void sum(int a) 
	{
			sum = area + radius;
			System.out.println(sum+a);
			
	}
}

