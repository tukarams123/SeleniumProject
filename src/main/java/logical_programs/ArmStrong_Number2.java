package logical_programs;

public class ArmStrong_Number2 {

	public static void main(String[] args) {

		int num=370;
		int temp=num;
		int rev=0;
		int rem;
		while(temp!=0)
		{
			rem=temp%10;
			rev=rem*rem*rem+rev;
			temp=temp/10;
		}
		if(rev==num)
		{
			System.out.println("Armstrong number");
		}
		else
		{
			System.out.println("Not a armstrong number");
		}
	}

}
