package Assignment3rd;

public class Ocb {

	public static void main(String[] args) {

		int binary = 1010, octal=01234567;
		String hexNum = "63";
		int decimal = Integer.parseInt(hexNum, 16);
		System.out.println("Decimal value is "+ decimal);
		System.out.println("Octal number is : "+ octal);
		System.out.println("Hexanumber is: "+ hexNum);
	}
}
