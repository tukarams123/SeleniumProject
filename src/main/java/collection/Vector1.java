package collection;

import java.util.Vector;

public class Vector1 {

	public static void main(String[] args) {

		Vector v1 = new Vector();
		v1.add("somnath");
		v1.add("somnath");
		v1.add(42);
		v1.add(76.11f);
		v1.add(null);
		v1.add(null);
		v1.add(3, "rohit");
		
		System.out.println("----Vector1----");
		System.out.println(v1);
		System.out.println(v1.capacity());
		System.out.println(v1.size());
		System.out.println(v1.get(2));
		v1.set(3, "ajay");
		System.out.println(v1);
		System.out.println(v1.isEmpty());
		v1.remove(4);
		System.out.println(v1);
		System.out.println(v1.hashCode());
		// a1.clear();
		// System.out.println(a1);

		System.out.println("----Vector2----");
		Vector v2 = new Vector();
		v2.add("somnath");
		v2.add(43);
		v2.add(42);
		System.out.println(v2);
		System.out.println(v1.equals(v2));
		System.out.println(v2.hashCode());
		v2.addAll(v1);
		System.out.println(v2);
		v2.removeAll(v1);
		System.out.println(v2);
		v2.clear();
		System.out.println(v2);


	}

}
