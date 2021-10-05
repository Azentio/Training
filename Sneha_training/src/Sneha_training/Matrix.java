package Sneha_training;

public class Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{1,4,7},{2,5,8},{3,6,9}};
		int b[][]= {{7,8,9},{4,5,6},{1,2,3}};
		int c[][]=new int[3][3];
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
   }
}