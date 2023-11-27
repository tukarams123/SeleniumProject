package collection;

import java.util.Enumeration;
import java.util.Vector;

public class Enumeration4 {

	public static void main(String[] args) {
		Vector v=new Vector();
		v.add("somnath");
		v.add(56);
		v.add(76.11f);
		v.add(null);
		v.add("MGM College");
		System.out.println(v);
		Enumeration en=v.elements();
		while(en.hasMoreElements())
		{
			Object o=en.nextElement();
			System.out.println(o);
		}

	}

}
