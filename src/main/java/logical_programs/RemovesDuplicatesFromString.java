package logical_programs;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class RemovesDuplicatesFromString {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String s1=sc.next();
		
		LinkedHashSet<Character> hs=new LinkedHashSet<Character>();
		
		for(int i=0;i<s1.length();i++)
		{
			hs.add(s1.charAt(i));
		}
		
		for(Character ch:hs)
		{
			System.out.print(ch);
		}

	}

}
