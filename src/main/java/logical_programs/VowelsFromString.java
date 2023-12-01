package logical_programs;

public class VowelsFromString {

	public static void main(String[] args) {
		String name="Somnath Shinde";
		int vowels=0;
		for(int i=1;i<=name.length()-1;i++)
		{
			char ch=name.charAt(i);
					if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
					{
						vowels++;
					}
		}
		System.out.println("Vowels in a string: "+vowels);

	}

}
