package collection;

import java.util.Iterator;
import java.util.LinkedList;


public class Iterator2 {

	public static void main(String[] args) {
		LinkedList l1=new LinkedList();
		l1.add(56);
		Iterator it=l1.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

	}

}
