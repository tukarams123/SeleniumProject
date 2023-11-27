package collection;

import java.util.ArrayList;

public class ForLoop {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("somnath");
		al.add(56);
		al.add(76.11f);
		al.add(null);
		al.add("MGM College");
		System.out.println(al);
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}

	}

}
