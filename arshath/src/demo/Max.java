package demo;

public class Max {

	public static void main(String[] args) {
		  int[] num = { 1, 2, 3, 4, 5, 6, 7, 8 };

	        int min = num[0];
	        int max = num[0];
	 for(int i =0; i< num.length; i++) {
		 
		 if(num[i] < min) {
			 min = num[i];
			 }
		 if(num[i] > max) {
			 max = num[i];
		 }
	 }
	 
	        System.out.println("Minimum number is : "+ min);
	        System.out.println("Maximum number is : "+ max);
	}

}
