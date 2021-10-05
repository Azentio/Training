
public class Circledemo {
	double radius;
	final double pi=3.14;
	public Circledemo(double radius)
	{
	this.radius=radius;	
	}
	public double getArea()
	{
		double area=pi*radius*radius;
	System.out.println("Area of the circle is"+area);
		return area;
	}
	public static void main(String[] args) {
		Circledemo cd=new Circledemo(5);
		cd.getArea();
	}

}
