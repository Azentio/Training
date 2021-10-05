package Assigments2;

public class Overloading {


		//add method of parameter a and b

		void addition(int a,int b){

		int sum=a+b;

		System.out.println("Sum of two numbers is "+sum);

		}

		//add method of parameter a, b and c

		void addition(int a,int b,int c){

		int sum=a+b+c;

		System.out.println("Sum of three numbers is "+sum);

		}

		public static void main(String args[]){

		Overloading ovl=new Overloading();

		ovl.addition(2,5,10);

		ovl.addition(15,10);

		}

		}
	
	
	
	
	
	

