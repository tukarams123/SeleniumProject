package return_type;

public class String_Return_type {

	public static void main(String[] args) {
		String name=fullName("akash","sirsat");
		System.out.println(name);
		
		System.out.println(fullName("shyam","rajegore"));

	}
	public static String fullName(String fn,String ln)
	{
		String fullname=fn+" "+ln;
		return fullname;
	}

}
