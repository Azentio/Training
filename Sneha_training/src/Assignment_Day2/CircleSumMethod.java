package Assignment_Day2;

public class CircleSumMethod {
	
	float radius;
	float Area;
	float Circumference;
	
	 CircleSumMethod(float radius,float Area,float Circumference)
	{
		this.radius = radius;
		this.Area = Area;
		this.Circumference = Circumference;
	}
	public float sum(float a, float b) 
	{
		return a+b;
	}
	
	public void sum(float a) 
	{
		System.out.println("Area of circle  = "+a);
	}


	public static void main(String[] args)
	{
		CircleSumMethod c1 = new CircleSumMethod(4.0f, 6.0f, 8.0f);
		CircleSumMethod c2 = new CircleSumMethod(2.0f, 1.0f, 1.0f);
	
		c2.sum(6.0f);
		System.out.println("sum of two numbers = " +c1.sum(2.0f,3.0f));
	
	}
}
