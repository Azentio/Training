package Assigments;

import java.util.Scanner;

public class CircleMain {

	public static void main(String[] args) {
		
		
		 // Create a Scanner object for keyboard input.
	    Scanner keyboard = new Scanner(System.in);

	    // Ask user to input circle radius
	    System.out.print("Enter the radius of a circle: ");
	    double radius = keyboard.nextDouble();

	    // close keyboard
	    keyboard.close();

	    // Create a Circle object passing in user input
	    Circle circleClass = new Circle();
	    Circle circle = new Circle(radius);

	    // Display circle details
	    System.out.println("Area is " + circle.getArea());
	    System.out.println("Diameter is " + circle.getDiameter());
	    System.out.println("Circumference is " + circle.getCircumference());

	}
		
		
	}


