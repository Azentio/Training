package assignment;

public class cirlce {
	final double pi=3.14;
	public float radius;
	public void setRadius(float rds)
	{
		radius=rds;
	}
	public float getRadius()
	{
		System.out.println("Radius of circle is"+ radius);
		return radius;
	}
	public double getArea()
	{
		double area = pi*radius*radius;
		System.out.println("Area of the circle is"+ area);
		return area;
	}
	public double getcircumference()
	{
		double circumference=2*pi*radius;
		System.out.println("circumference of the circle is+ circumference");
		return circumference;
	}
	public static void main(String[] args)
	{
		cirlce c= new cirlce();
		c.setRadius(4);
		c.getRadius();
		c.getArea();
		c.getcircumference();
		
	}
}
