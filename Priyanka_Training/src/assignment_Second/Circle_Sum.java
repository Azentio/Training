package assignment_Second;



public class Circle_Sum 
{
	float radius;
	float Area;
	float Circumference;
	
	Circle_Sum (float radius,float Area,float Circumference)
	{
		this.radius = radius;
		this.Area = Area;
		this.Circumference = Circumference;
	}
	public float sum(float radius, float Area) 
	{
		return radius+Area;
	}
	
	public void sum(float Area) 
	{
		System.out.println("Area of second circle  = "+Area);
	}


	public static void main(String[] args)
	{
		Circle_Sum c1 = new Circle_Sum(1.0f, 2.0f, 3.0f);
		Circle_Sum c2 = new Circle_Sum(3.0f, 2.0f, 3.0f);
	
		c2.sum(3.0f);
		System.out.println("sum of radius and area = " +c1.sum(1.0f,2.0f));
	
	}
}
