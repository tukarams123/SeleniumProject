package logical_programs;

import java.util.TreeSet;

public class RemoveDuplicatesFromArrayUsingHashtable {

	public static void main(String[] args) {
		int arr[] = { 10, 45, 56, 56, 10, 45, 34 };

		TreeSet<Integer> tr = new TreeSet<Integer>();
		for (int t : arr) {
			tr.add(t);
		}
		System.out.println(tr);
	}

}
