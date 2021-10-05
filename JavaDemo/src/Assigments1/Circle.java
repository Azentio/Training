package Assigments1;

public class Circle {
	
	double radius,area,circumference;
	
	public Circle(double radius)
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


