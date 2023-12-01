package logical_programs;

import java.util.Scanner;

public class Number_Reverse {

	public static void main(String[] args) {
//		/*Scanner sc=new Scanner(System.in);
//		System.out.println("Enter one number");
//		int num=sc.nextInt();
		int num=12345;
		int numReverse=0;
		
		while(num>0) //12345>0
		{
			int rem=num%10;  //5  
			numReverse=numReverse*10+rem;  //0*10+5=5                                                   
			num=num/10;  //1234
		}
		System.out.println(numReverse);

	}
		
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter one number");
		int num=sc.nextInt();
		int numReverse=0;
		
		for(int i=num;i>0;i=i/10)
		{
			int rem=i%10;
			numReverse=numReverse*10+rem;

			
		}
		System.out.println("Original number --- "+num);

		System.out.println("Reverse number --- "+numReverse);

	}*/
}
