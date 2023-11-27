package collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Linkedhashset {

	public static void main(String[] args) {
		
		
		LinkedHashSet hs=new LinkedHashSet();
		hs.add("rahul");
		hs.add(12);
		hs.add('A');
		hs.add(78.5f);
		hs.add(12);
		hs.add(null);
		hs.add(null);
		hs.add(null);

		System.out.println(hs);
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());
		hs.remove(78.5f);
		System.out.println(hs);
		
		
		System.out.println("---printing all the elements using iterator---");
		Iterator itr=hs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("---printing all the elements using foreach loop---");
		for(Object o:hs)
		{
			System.out.println(o);
		}

	}

}
