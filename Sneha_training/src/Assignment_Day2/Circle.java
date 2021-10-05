package Assignment_Day2;



public class Circle 
{
	 private double  radius;
	  private final double pi = 3.14159;
	  
	  public void setRadius(double r)
	  {
		  radius = r;
	  }
	  public double getRadius()
	  {		
		  return radius;
		  
	  }
	  
	  public double getArea() {
		  double rd1=pi * radius * radius;
		  return rd1;
		  }
	  
	  public double getCircumference()
	  {
		  double rd2= 2*pi*radius;
		  return rd2;
	  }

	 

		public static void main(String[] args) 
		{
			Circle c= new Circle ();
				c.setRadius(2.5);
			System.out.println("Radius of circle = " +c.getRadius());
			 
			System.out.println("Area of Circle = " +c.getArea());
			
			System.out.println("Circumference of Circle = " +c.getCircumference());
	

		}
}
