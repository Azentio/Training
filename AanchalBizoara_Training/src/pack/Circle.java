package pack;
import java.util.ArrayList;
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
			
			ArrayList<Integer> circleArea=new ArrayList<Integer>();
			circleArea.add(200);
			circleArea.add(300);
			circleArea.add(400);
			circleArea.add(500);

			System.out.println("Previously calculated areas of circles");
			for(int i:circleArea)
			{
				System.out.println(i);
			}
			
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



