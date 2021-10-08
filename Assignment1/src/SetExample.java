import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set = new HashSet<String>();
		set.add("Anandh");
		set.add("Dhoni");
		set.add("Virat");
		Iterator<String> i=set.iterator();
		if(i.hasNext())
		{
			String name=i.next();
			System.out.println(name);
		}
		
		
		

	}

}
