package Assignement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("banana");
		list.add("Mango");
		list.add("Apple");
		list.add("Pinaple");
		list.add("Orange");
		Iterator<String> itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
