import java.util.HashMap;
import java.util.Map;

public class Bookmap {

	public static void main(String[] args) {
		Map<String,String> book= new HashMap<String,String>();
		book.put("Arshath", "9876543216");
		book.put("basha", "8023564566");
		book.put("Arsh", "8898754435");
		
		//output
		System.out.println(book.get("Arshath"));
		System.out.println(book.get("basha"));
		System.out.println(book.get("Arsh"));
	}

}
