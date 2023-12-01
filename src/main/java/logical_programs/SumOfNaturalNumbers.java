package logical_programs;

public class SumOfNaturalNumbers {

	public static void main(String[] args) {

		int i=0;
		int num=100;
		int sum=0;
		while(i<=num)
		{
			sum=sum+i;
			i++;
		}
		System.out.println(sum);
	}

}
