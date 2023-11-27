package collection;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		
		ArrayList a1=new ArrayList();
		a1.add("somnath");
		a1.add("somnath");
		a1.add(42);
		a1.add(76.11f);
		a1.add(null);
		a1.add(null);
		a1.add(3, "rohit");
		
		System.out.println("----ArrayList1----");
		System.out.println(a1);
		System.out.println(a1.size());
		System.out.println(a1.get(2));
		a1.set(3, "ajay");
		System.out.println(a1);
		System.out.println(a1.isEmpty());
		a1.remove(4);
		System.out.println(a1);
		System.out.println(a1.hashCode());
		//a1.clear();
		//System.out.println(a1);



		System.out.println("----ArrayList2----");
		ArrayList a2=new ArrayList();
		a2.add("somnath");
		a2.add(43);
		a2.add(42);
		System.out.println(a2);
		System.out.println(a1.equals(a2));
		System.out.println(a2.hashCode());
		a2.addAll(a1);
		System.out.println(a2);
		a2.removeAll(a1);
		System.out.println(a2);
		a2.clear();
		System.out.println(a2);







	}

}
