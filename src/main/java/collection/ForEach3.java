package collection;

import java.util.ArrayList;

public class ForEach3 {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("somnath");
		al.add(56);
		al.add(76.11f);
		al.add(null);
		al.add("MGM College");
		System.out.println(al);
		for(Object o:al)
		{
			System.out.println(o);
		}

	}

}
