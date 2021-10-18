import java.util.ArrayList;
import java.util.Iterator;

public class Iter {

	public static void main(String[] args) {
		ArrayList<String> array=new ArrayList<>();
		array.add("Apple");
		array.add("Orange");
		array.add("Mango");
		array.add("Banana");
		
		Iterator<String> Itr=array.iterator();
		while(Itr.hasNext()) {
			System.out.println("The Next fruit is : " +Itr.next());
		}
		
		
	}
}