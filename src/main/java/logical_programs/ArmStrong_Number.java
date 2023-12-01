package logical_programs;

public class ArmStrong_Number {

	public static void main(String[] args) {
     //153=(1*1*1)+(5*5*5)+(3*3*3)=153

		int number = 153,originalNumber,rem;
		double result = 0;

		originalNumber = number;

		while (originalNumber != 0) {
			rem = originalNumber % 10;
			result = result + Math.pow(rem, 3);
			originalNumber=originalNumber / 10;
		}

		if (result == number) 
			System.out.println(number + " is an Armstrong number");
		else
			System.out.println(number + " is not an Armstrong number");
	}

}
