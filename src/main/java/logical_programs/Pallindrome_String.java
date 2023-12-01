package logical_programs;

import java.util.Scanner;

public class Pallindrome_String {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter one string");
		String name = sc.next();
		String rev="";
		
		for(int i=name.length()-1;i>=0;i--)
		{
			rev=rev+name.charAt(i);
		}
		System.out.println("Reverse string -- "+rev);
		
		if(name.equals(rev))
		{
			System.out.println("Given string is pallindrome");
		}
		else
		{
			System.out.println("Given string is not pallindrome");
		}

	}

}
