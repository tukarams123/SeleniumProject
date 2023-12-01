package logical_programs;

public class ReverseMiddle {

	public static void main(String[] args) {

		String str="My name is abc";
		//char ch[]=str.toCharArray();
		String[] s=str.split(" ");
		System.out.println(s[1]);
		String rev="";

		String a=s[1].toString();
		for(int j=a.length()-1;j>=0;j--)
		{
			rev=rev+a.charAt(j);
		}
		System.out.println(rev);
		
		
		
		
		
		
	}

}
