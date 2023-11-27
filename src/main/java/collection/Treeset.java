package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class Treeset {

	public static void main(String[] args) {
		TreeSet tr=new TreeSet();
		tr.add(34);
		tr.add(76);
		tr.add(67);
		//tr.add("ajay");  //ClassCastException
		tr.add(87);
		tr.add(98);
		tr.add(67);
		//tr.add(null);  //NullPointerException
		System.out.println(tr);
		System.out.println(tr.first()); //returns first object from treeset
		System.out.println(tr.size());
		System.out.println(tr.isEmpty());
		tr.remove(67);
		System.out.println(tr);
		System.out.println(tr.hashCode());
		tr.pollFirst(); //removes first object from treeset
		tr.pollLast();  //removes last object from treeset
		System.out.println(tr);

		System.out.println("---printing all the elements using iterator---");
		Iterator itr=tr.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	
		System.out.println("---printing all the elements using foreach loop---");
		for(Object o:tr)
		{
			System.out.println(o);
		}
	}

}
