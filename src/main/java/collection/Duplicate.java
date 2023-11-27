package collection;

import java.util.ArrayList;
import java.util.TreeSet;

public class Duplicate {

	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add(1);
		a1.add(1);
		a1.add(3);
		a1.add(4);
		a1.add(4);


		TreeSet tr=new TreeSet(a1);
		System.out.println(tr);
	}

}
