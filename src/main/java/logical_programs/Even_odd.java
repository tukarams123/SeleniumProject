package logical_programs;

import java.util.Scanner;

public class Even_odd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		if (num % 2 == 0) {
			System.out.println("Number is even " + num);
		} else {
			System.out.println("Number is odd " + num);

		}
	}

}
