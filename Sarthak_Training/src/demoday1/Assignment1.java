package demoday1;

public class Assignment1 {

	public static void main(String[] args) {
		
		System.out.println("==================");
		System.out.println("Print your name 10 times");
		System.out.println("==================");
		
		for (int i=0;i<10;i++) {
			System.out.println("SARTHAK");
		}
		
		
		
		
		System.out.println("==================");
		System.out.println("Print a multiplication table of format(1 x 9 = 9)");
		System.out.println("==================");
		
		int n = 9;
		
		for(int i=0;i<11;i++) {
			System.out.println(i + " x " + n + " = " +n*i );
		}
		
		
		
		
		System.out.println("==================");
		System.out.println("Print a grade based on mark obtained");
		System.out.println("------------------");
		
		int m = 49;
		
		if (m == 100) {
			System.out.println("Result : OUSTANDING");
		}
		
		else if (m >= 90) {
			System.out.println("Result : A Grade");
		}
		
		else if (m >= 80) {
			System.out.println("Result : B Grade");
		}
		
		else if (m >= 50) {
			System.out.println("Result : C Grade");
		}
		
		else {
			System.out.println("Result : FAIL");
		}
/*		else if (m < 50) {
			System.out.println("FAIL");
	}*/
		
		System.out.println("==================");
		System.out.println("Print the absolute value of given number using ternary operator.");
		System.out.println("------------------");
		
		
		
		int x=10,y=20,z;
		z = x > y ? x:y ;
		System.out.println("Highest of Two Numbers : "+z);
		
		
		System.out.println("==================");
		System.out.println("Program for 3x3 matrix addition");
		System.out.println("==================");
		
		int q[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int w[][]= {{1,2,3},{4,5,6},{7,8,9}};
		
		int e[][]= new int[3][3];
		
		for (int i=0;i<3;i++) {
		for (int j=0;j<3;j++){  
			e[i][j] = q[i][j] + w[i][j]; 
			System.out.println(e[i][j]+" ");
		}
		System.out.println();
		}
		
		
		System.out.println("==================");
		System.out.println("String array of 5 cities and print it");
		System.out.println("==================");
//		
//		
		String[] arr = {"Raipur","Bhilai","Mumbai","Bangalore","Pune"};
//		
		for (String str:arr) {
			System.out.println(str);
		}
//		for (int i1 = 0;i1<arr.length;i1++) {
//			System.out.println(arr[i1]);
//		}
	
		System.out.println("==================");
		System.out.println("Array of 8 elements and print min and max element");
		System.out.println("==================");
		
		
//		int[] arr1 = {1,2,3,4,5,6,7,8};
		
		int []a =new int[]{1,2,3,4,5,6,7,8}; 
        int min=a[0], max=a[0]; 
      
        for (int i = 0; i< a.length; i++)
        { 
           
           if(a[i]<min) 
               min=a[i]; 
        } 
        System.out.println("Minimun number: " + min); 
      
        for (int i = 0; i < a.length; i++)
        { 
           
           if(a[i]>max) 
               max=a[i]; 
        } 
        System.out.println("Max Number: " + max);
}
}

