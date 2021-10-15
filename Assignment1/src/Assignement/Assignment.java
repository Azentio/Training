package Assignement;

public class Assignment {

	public void printIntegerValue(int int_value, byte byte_value, long long_value, short short_value) {
		System.out.println("Integer value is:" + int_value);
		System.out.println("Byte value is:" + byte_value);
		System.out.println("long value is:" + long_value);
		System.out.println("short value is:" + short_value);
	}

	public void printFloatValue(float folat_value, double double_value) {
		System.out.println("Float value is:" + folat_value);
		System.out.println("double value is:" + double_value);
	}

	public void printValue(int binary_value, int hex_value, int oct_value) {
		System.out.printf("Binary vlaue is:%od", binary_value);
		System.out.println();
		System.out.printf("hex_value is:0x%x" , hex_value);
		System.out.println();
		System.out.printf("Oct Value is:0%o",oct_value);
	}

	public static void main(String[] args) {
		Assignment assign = new Assignment();
		assign.printIntegerValue(10, (byte) 20, 90, (short) 10);
		assign.printFloatValue(12.3f, 199.0);
		assign.printValue( 0b0010,  0x64,  00144);
	}

}
