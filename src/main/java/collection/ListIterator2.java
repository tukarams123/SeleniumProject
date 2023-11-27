package collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIterator2 {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("somnath");
		al.add(56);
		al.add(76.11f);
		al.add(null);
		al.add("MGM College");
		System.out.println(al);
		ListIterator it= al.listIterator();
		while(it.hasPrevious())
		{
			System.out.println(it.previous());
		}

	}

}
