package pack04;

import java.util.Scanner;

public class Ternary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
 		
		int a,b,c; 
		
 		System.out.println("Enter First Number : "); 
		a=sc.nextInt();
		
		System.out.println("Enter Second Number : "); 
		b=sc.nextInt();
			  
		c=a>b?a:b;
		
		System.out.println("Highest of Two Numbers : " + c);

	}

}
