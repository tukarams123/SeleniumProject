package logical_programs;

public class white_spaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="sn e  h a";
		int spaces=0;
		
		for(int i=0;i<=str.length()-1;i++)
		{
			char ch=str.charAt(i);
//			if(Character.isWhitespace(ch))
//			{
//				spaces++;
//			}
			if(ch==' ')
			{
				spaces++;
			}
		}
		System.out.println("Total number of white spaces: "+spaces);


	}

}
