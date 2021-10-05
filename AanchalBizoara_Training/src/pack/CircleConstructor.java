package pack;

public class CircleConstructor 
{
	double radius,area,circumference;
	
	public CircleConstructor(double radius)
	{
		this.radius=radius;
	}
	
	public void getArea()
	{
		 area=3.14*radius*radius;
		 System.out.println("Area of the circle is "+area);
	}
	
	public void getCircumference()
	{
		circumference=2*3.14*radius;
		 System.out.println("Circumference of the circle is "+circumference);
	}

}
