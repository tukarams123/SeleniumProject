package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;
import java.util.Vector;

public class Generics {

	public static void main(String[] args) {
		System.out.println("---ArrayList---");
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(67);
		a1.add(89);
		a1.add(42);
		a1.add(76);
		a1.add(76);
		//a1.add(null);
		//a1.add(null);
		a1.add(3, 90);
		System.out.println(a1);
		a1.remove(0);
		System.out.println(a1);
		
		System.out.println("---printing all the elements using foreach loop---");
		for(int o:a1)
		{
			System.out.println(o);
		}


		System.out.println("---Vector---");
		Vector<String> v1 = new Vector<String>();
		v1.add("somnath");
		v1.add("somnath");
		v1.add("ram");
		v1.add("ajay");
		//v1.add(null);
		//v1.add(null);
		v1.add(3, "rohit");
		//String s=v1.toString().toUpperCase();
		//System.out.println(s);
		String s=v1.toString().toUpperCase();
		System.out.println(s);
		
		System.out.println(v1);
		
		System.out.println("---printing all the elements using foreach loop---");
		for(String o:v1)
		{
			System.out.println(o.length());
			//System.out.println(o.endsWith("m"));
		}

		
		System.out.println("---LinkedList---");
		LinkedList<Float> l1=new LinkedList<Float>();
		l1.add(89.6f);
		l1.add(12.7f);
		l1.add(42.7f);
		l1.add(76.11f);
		l1.add(76.11f);
		l1.add(null);
		l1.add(null);
		l1.add(3, 78.9f);
		System.out.println(l1);
		
		System.out.println("---printing all the elements using foreach loop---");
		for(Float o:l1)
		{
			System.out.println(o);
		}

		
		System.out.println("---HashSet---");
		HashSet<Character> hs=new HashSet<Character>();
		hs.add('B');
		hs.add('C');
		hs.add('A');
		hs.add('E');
		hs.add('D');
		hs.add('D');
		hs.add(null);
		hs.add(null);
		hs.add(null);
		System.out.println(hs);

		System.out.println("---printing all the elements using foreach loop---");
		for(Character o:hs)
		{
			System.out.println(o);
		}
		
		
		System.out.println("---LinkedHashSet---");
		LinkedHashSet<Integer> lhs=new LinkedHashSet<Integer>();
		lhs.add(67);
		lhs.add(12);
		lhs.add(98);
		lhs.add(98);
		lhs.add(12);
		lhs.add(null);
		lhs.add(null);
		lhs.add(null);
		System.out.println(lhs);

		System.out.println("---printing all the elements using foreach loop---");
		for(Integer o:lhs)
		{
			System.out.println(o);
		}

		
		System.out.println("---TreeSet---");
		TreeSet<String> tr=new TreeSet<String>();
		tr.add("shyam");
		tr.add("ram");
		tr.add("amar");
		tr.add("amar");
		tr.add("ajay");  
		//tr.add(null); //NullPointerException
		System.out.println(tr);

		System.out.println("---printing all the elements using foreach loop---");
		for(String o:tr)
		{
			System.out.println(o);
		}

	}

}
