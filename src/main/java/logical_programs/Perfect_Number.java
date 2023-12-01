package logical_programs;

public class Perfect_Number {

	public static void main(String[] args) {
		int number=6;
		int s=1;
		int sum=0;
		while(s<=number)
		{
			if(number%s==0)
			{
				sum=sum+s;
			}
			s++;
		}
		if(sum-number==number)
		{
			System.out.println("The number is perfect number");
		}
		else
		{
			System.out.println("The number is not perfect number");

		}

	}

}
