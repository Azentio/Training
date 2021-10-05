package Sneha_training;

public class Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner scn= new java.util.Scanner(System.in);
		System.out.println("Enter passing marks:");
		int a= scn.nextInt();
		if(a<50)
		{
			System.out.println("Fail");
		}else if(a<=80 && a>=50)
		{
			System.out.println("Grade c");
		}else if(a>80 && a<=90)
		{
			System.out.println("Grade B");
		}else if(a>90 && a!=100)
		{
			System.out.println("Grade A");
		}else
		{
			System.out.println("Outstanding");
		}	
	}

}
