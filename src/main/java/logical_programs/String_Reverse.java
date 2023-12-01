package logical_programs;

import java.util.Scanner;

public class String_Reverse {

	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter one string");
//		String name=sc.next();
		String name="shyam";
		String rev="";
		
		for(int i=name.length()-1;i>=0;i--)
		{
			rev=rev+name.charAt(i);
		}
		System.out.println("String in reverse format--- "+rev);

	}

}
