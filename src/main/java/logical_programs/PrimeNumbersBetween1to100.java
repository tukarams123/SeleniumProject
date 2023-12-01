package logical_programs;

public class PrimeNumbersBetween1to100 {

	public static void main(String[] args) {

		int temp=0;
		for(int num=1;num<=100;num++)
		{
				if(num%2==0)
				{
					temp++;
				}
			
			if(temp==0)
			{
				System.out.println(num);
			}
			else
			{
				temp=0;
			}
		}
	}
}
