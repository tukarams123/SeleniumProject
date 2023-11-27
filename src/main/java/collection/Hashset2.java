package collection;

import java.util.ArrayList;
import java.util.HashSet;

public class Hashset2 {

	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add("somnath");
		a1.add("somnath");
		a1.add(42);
		a1.add(76.11f);
		a1.add(null);
		a1.add(null);
		a1.add(3, "rohit");
		
		HashSet hs=new HashSet(a1);
		System.out.println(hs);

	}

}
