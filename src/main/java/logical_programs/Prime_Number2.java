package logical_programs;

public class Prime_Number2 {

	public static void main(String[] args) {

		int num=7;
		int count=0;
		for(int i=2;i<num-1;i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
		if(count==0)
		{
			System.out.println("The number is prime "+num);
		}
		else
		{
			System.out.println("The number is not prime "+num);
		}
	}

}
