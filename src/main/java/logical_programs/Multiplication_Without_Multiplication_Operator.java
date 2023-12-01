package logical_programs;

public class Multiplication_Without_Multiplication_Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5;
		int b=6;
		int sum=0;
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter one number");
//		a=sc.nextInt();
//		
//		System.out.println("Enter second number");
//		b=sc.nextInt();
		
		for(int i=1;i<=a;i++) //i=1 ,1<=5,2<=5,3<=5,4<=5,5<=5,6<=5
		{
			sum=sum+b;  //6,12,18,24,30
		}
		System.out.println("Multiplication of two numbers without using multiplication operator: "+sum);


	}

}
