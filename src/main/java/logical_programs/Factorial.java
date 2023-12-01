package logical_programs;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter one number");  //5*4*3*2*1
		int num=sc.nextInt();
		int fact=1;  
		
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of a number "+fact);
		

	}

}
