package logical_programs;

public class Count_Of_No_Of_Digits {

	public static void main(String[] args) {

		int num=787654;
		int count=0;
		while(num>0)
		{
			num=num/10;
			count++;
		}
		System.out.println(count);
	}

}
