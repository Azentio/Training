package pack;
import java.util.Scanner;

	public class Circle {
		
		double radius;

		
		public static void main(String[] args) 
		
		{
			
			Circle c=new Circle();
			c.setRadius();
			c.getRadius();
			c.getArea();
			c.getCircumference();
			

		}

		public void setRadius()
		{
			radius=7.8;
			System.out.println("The radius of the circle is "+radius);
		}
		
		public void getRadius()
		{
			Scanner s=new Scanner(System.in);
			
			System.out.println("Please enter new radius ");
			
			 radius=s.nextInt();
			
			 System.out.println("New radius is "+ radius);
			
		}
		 public void getArea()
		 {
			 double area=3.17*radius*radius;
			 System.out.println("Area is "+area);
		 }
		 public void getCircumference()
		 {
			 double circumference=2*3.17*radius;
			 System.out.println("Circumference is "+circumference);
		 }
		 
	}



