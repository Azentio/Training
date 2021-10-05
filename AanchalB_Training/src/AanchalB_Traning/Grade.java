package AanchalB_Traning;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner s=new Scanner(System.in);
		
		int a;
		System.out.println("Please enter your total marks obtained");
		a=s.nextInt();
		
		if (a == 100) {
			System.out.println("Result : OUSTANDING");
		}
		
		else if (a >= 90) {
			System.out.println("Result : A Grade");
		}
		
		else if (a >= 80) {
			System.out.println("Result : B Grade");
		}
		
		else if (a >= 50) {
			System.out.println("Result : C Grade");
		}
		
		else {
			System.out.println("Result : FAIL");
		}
	}

}
