package Sneha_training;

import java.util.Scanner;

public class AbsoluteValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner scn= new java.util.Scanner(System.in);
		System.out.println("Enter any no.");
		int a=scn.nextInt();
		int b=0;
		
		b=a<0? a*=(-1):a;
	
		System.out.println("Absolute Value="+b);
}
}