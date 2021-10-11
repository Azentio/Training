import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		Set<String> set=new HashSet<String>();
		
		Object a[]=new Object[10];
		set.add("Anandh");
		set.add("Virat");
		set.add("Dhoni");
		set.add("Rohit");
		set.add("ABD");
		Iterator itr=set.iterator();
		String value;
		while(itr.hasNext())
		{
		//value=(String) itr.next();
		String s=(String) itr.next();
		
		if(s=="Dhoni")
		{
			
			System.out.println(s+" is Captain cool");
		}
		//System.out.println(value);
		}
		a=set.toArray();
		System.out.println("After converting to array :");
		for(int j=0;j<a.length;j++)
		{
		System.out.println(a[j]);
		}
		System.out.println("Size of the set is:"+set.size());	
		//System.out.println(set);
	}
	
}



