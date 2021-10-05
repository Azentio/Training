package assignment_Second;



public class Circle 
{
	 private double  radius;
	  private final double pI = 3.14159;
	  
	  public void setRadius(double r)
	  {
		  radius = r;
	  }
	  public double getRadius()
	  {		
		  return radius;
		  
	  }
	  
	  public double getArea() {
		  double r1=pI * radius * radius;
		  return r1;
		  }
	  
	  public double getCircumference()
	  {
		  double r2= 2*pI*radius;
		  return r2;
	  }

	 

		public static void main(String[] args) 
		{
			Circle c= new Circle ();
			 c.setRadius(1.3);
			 System.out.println(c.getArea());
			  System.out.println(c.getCircumference());

		}
}
