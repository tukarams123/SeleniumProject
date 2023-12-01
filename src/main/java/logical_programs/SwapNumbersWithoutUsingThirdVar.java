package logical_programs;

import java.util.Scanner;

public class SwapNumbersWithoutUsingThirdVar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int first = sc.nextInt();//10

		System.out.println("Enter second number");
		int second = sc.nextInt();//20

		System.out.println("Before swapping:");
		System.out.println("First number -- " + first);
		System.out.println("Second number -- " + second);

		first = first + second;   //10+20===30
		second = first - second; //30-20=10
		first = first - second;  //30-10=20

		System.out.println("After swapping:");
		System.out.println("First number -- " + first);
		System.out.println("Second number -- " + second);

	}

}
