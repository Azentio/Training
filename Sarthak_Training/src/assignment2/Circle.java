package assignment2;
import java.util.Scanner;

public class Circle {
		
		double radius;
	
		public void setRadius(){
			radius = 10;
			System.out.println("Radius is: "+radius);
		}
		
		public void getRadius(){		
			Scanner Scan=new Scanner(System.in);
			System.out.print("Enter radius: ");
			
			 radius=Scan.nextInt();
		}
		
		 public void getArea() {
			 
			 double area= (3.17) * radius * radius;
			 System.out.println("Area= "+ area);
		 }
		
		 public void getCircumference()
		
		 {
			
			 double circumference= 2 * (3.17) * radius;
			
			 System.out.println("Circumference= "+ circumference);
			
		 }
		
		
		public static void main(String[] args)
			
			{
				
			Circle Cal=new Circle();
			
			Cal.setRadius();
			
			Cal.getRadius();
			
			Cal.getArea();
			
			Cal.getCircumference();
				
			}
		
	}
