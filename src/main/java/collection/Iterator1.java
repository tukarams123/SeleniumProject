package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator1 {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("somnath");
		al.add(56);
		al.add(76.11f);
		//al.add(null);
		al.add("MGM College");
		System.out.println(al);
		Iterator it= al.iterator();
		while(it.hasNext())
		{
			if(it.next().equals("MGM College"))
			it.remove();
		}
		System.out.println(al);

	}

}
