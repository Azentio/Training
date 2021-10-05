
import java.util.Scanner;

public class Radius 
{
   public static void main(String[] args) 
   {
      Scanner sc = new Scanner(System.in);  
      System.out.println("Please enter radius : ");
      double radius = sc.nextDouble();
      
      double area = calculateArea(radius);  
      System.out.println("Area of circle : " + area);
      sc.close();
   }
   static double calculateArea(double r)
   {
      return (22 * r * r) / 7;
   }
}