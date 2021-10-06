package assignment;

public class circledemo {
	double radius;
	final double pi=3.14;
	public circledemo(double radius)
	{
		this.radius=radius;
	}
	public double getArea()
	{
		double area=pi*radius*radius;
		System.out.println("Area of the circle is"+ area);
		return area;
	}
	public static void main(String [] args) {
		circledemo cd=new circledemo(5);
		cd.getArea();
	}
}	
	
