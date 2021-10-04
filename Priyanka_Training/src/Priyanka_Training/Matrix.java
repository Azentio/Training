package Priyanka_Training;

import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) 
	{
		int mat1[][]=new int[3][3];
		int mat2[][]=new int[3][3];
		int mat3[][]=new int[3][3];
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Matrix 1 elements");
		
		for(int row=0; row<mat1.length; row++)
		{
			for(int col=0; col<mat1[0].length; col++)
			{
				mat1[row][col]=s.nextInt();
			}
		}
		
		System.out.println("Enter Matrix 2 elements");
		
		for(int row=0; row<mat2.length; row++)
		{
			for(int col=0; col<mat2[0].length; col++)
			{
				mat2[row][col]=s.nextInt();
			}
		}
		
		System.out.println("Performing Addition ");
		
		for(int row=0; row<mat3.length; row++)
		{
			for(int col=0; col<mat3[0].length; col++)
			{
				mat3[row][col]=mat1[row][col]+mat2[row][col];
			}
		}
		
		System.out.println("Output");
		for(int row=0; row<mat3.length; row++)
		{
			for(int col=0; col<mat3[0].length; col++)
			{
				System.out.print(mat3[row][col]+" ");
			}
			System.out.println();
		}
		

	}

}
