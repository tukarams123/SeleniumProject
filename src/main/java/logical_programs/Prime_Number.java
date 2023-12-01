package logical_programs;

public class Prime_Number {

	public static void main(String[] args) {
		int num=5;
		int s=1;
		int count=0;
		while(s<=num)
		{
			if(num%s==0)
			{
				count++;
			}
			s++;
		}
		if(count==2)
		{
			System.out.println("The number is prime");
		}
		else
		{
			System.out.println("The number is not prime");
		}

	}

}
