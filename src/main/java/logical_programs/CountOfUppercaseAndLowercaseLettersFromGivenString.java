package logical_programs;

public class CountOfUppercaseAndLowercaseLettersFromGivenString {

	public static void main(String[] args) {

		String str="SoHaN amDaRE";
		char ch[]=str.toCharArray();
		int uc=0;
		int lc=0;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='A' && ch[i]<='Z')
			{
				uc++;
			}
			else if(ch[i]>='a' && ch[i]<='z')
			{
				lc++;
			}
		}
		System.out.println("Count of uppercase letters: "+uc);
		System.out.println("Count of lowercase letters: "+lc);
		
	}

}
