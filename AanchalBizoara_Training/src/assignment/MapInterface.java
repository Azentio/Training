package assignment;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapInterface {
	
	public static void main(String args[])

	{
		Map<Integer,String> m=new HashMap<Integer, String>();
		m.put(1234567890,"A");
		m.put(1234509876,"B");
		m.put(1987654321,"C");
	

	    Set<Entry<Integer,String>> set=m.entrySet();
	    
	    for(Entry<Integer,String>e:set)
	    {
	    	System.out.print(e.getValue()+": ");
	    	System.out.println(e.getKey());
	      

	}	
	}
	}

