package demo;

public class Circle {
	static double pi=3.14; 
	public float radius;
	public void setRadius(float rds)
	{
	radius=rds;	
	}
	public float getRadius()
	{
		System.out.println("The radius of the circle is :" + radius);
	return radius;	
	}
	public double getArea()
	{
		double area = pi*radius*radius;
		System.out.println("Area of the circle is"+area);
		return area;
		
	}
	public double getCircumference()
	{
		double circumference=2*pi*radius;
		System.out.println("circumference of the circle is :"+ circumference);
		return circumference;
	}
	public static void main(String[] args) {
		Circle c=new Circle();
		c.setRadius(4);
		c.getRadius();
		c.getArea();
		c.getCircumference();

	}
}
