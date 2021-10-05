package demo;

public class circle1 {
		double radius;
		final double pi=3.14;
		
		
	public void setRadius(double rd) {
		radius=rd;
	}
	public double getRadius() {
		return radius;
	}
	
	public double getArea() {
		double area=pi*radius*radius;		
		System.out.println("circle area is "+area);
		return area;
	}
	
	public double getCircumference() {
		double circum = 2*pi*radius;
		System.out.println("circum circle is " +circum);
		return circum;
		
	}
	public static void main(String[] args) {
		circle1 a=new circle1();
		a.setRadius(3);
		a.getArea();
		a.getCircumference();
	}

}
