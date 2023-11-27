package return_type;

public class Integer_Return_type {

	public static void main(String[] args) {
		int addition=add(10,20);
		System.out.println(addition);
		
		System.out.println(add(40,30));

	}
	public static int add(int a, int b)
	{
		int c=a+b;
		return c;
	}

}
