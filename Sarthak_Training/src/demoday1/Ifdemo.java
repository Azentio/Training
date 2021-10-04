package demoday1;

public class Ifdemo {
	
	public static void main(String[] args) {
		
		int a = 7, c = 4, sum;
		sum = a+c;
		
		if (sum==13) {
			System.out.println("Conditon is true");
		}
		else if (sum < 11){
			System.out.println("Conditon is false");
		}
		else {
			System.out.println("SAHI");
		}
		
		
		System.out.println(sum);
	}

}
