package demo;

public class key  {
		double radius;
		double a=1.5;
		
	public key(double radius) {
		this.radius=radius;
	}

	public double getArea() {
		double area=a*radius*radius;
		System.out.println("The circle is " +area);
		return area;		
	}
	public static void main(String[] args) {
		key k=new key(3);
		k.getArea();
		
	}
	
	
	
	
	}
