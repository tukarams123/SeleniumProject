package collection;

import java.util.LinkedList;

public class Linkedlist {

	public static void main(String[] args) {
		
		LinkedList l1=new LinkedList();
		l1.add("somnath");
		l1.add("somnath");
		l1.add(42);
		l1.add(76.11f);
		l1.add(null);
		l1.add(null);
		l1.add(3, "rohit");
		System.out.println("----LinkedList1----");
		l1.addFirst(56);
		l1.addLast("ram");
		l1.removeFirst();
		l1.removeLast();
		System.out.println(l1);
		System.out.println(l1.size());
		System.out.println(l1.get(2));
		l1.set(3, "ajay");
		System.out.println(l1);
		System.out.println(l1.isEmpty());
		l1.remove(4);
		System.out.println(l1);
		System.out.println(l1.hashCode());
		System.out.println(l1.peekFirst());
		System.out.println(l1.peekLast());
		l1.pollFirst();
		l1.pollLast();
		System.out.println(l1);
		//a1.clear();
		//System.out.println(a1);



		System.out.println("----LinkedList2----");
		LinkedList l2=new LinkedList();
		l2.add("somnath");
		l2.add(43);
		l2.add(42);
		System.out.println(l2);
		System.out.println(l1.equals(l2));
		System.out.println(l2.hashCode());
		l2.addAll(l1);
		System.out.println(l2);
		l2.removeAll(l1);
		System.out.println(l2);
		l2.clear();
		System.out.println(l2);







	}

}
