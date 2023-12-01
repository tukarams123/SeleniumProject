package logical_programs;


public class ReverseStringSentence {
	public static void main(String[] args) {
		String str="My name is abc";
		String s[]=str.split(" ");
		
		for(int i=s.length-1;i>=0;i--)
		{
			System.out.print(s[i]+" ");
		}
	}

//    public void reverse(String[] source) {
//
//        String dest = "";
//        for (int n = source.length - 1; n >= 0; n--) {
//            dest += source[n] + " ";
//        }
//        System.out.println(dest);
//
//    }
//
//    public static void main(String args[]) {
//        ReverseStringSentence rs = new ReverseStringSentence();
//        String[] str = "What is going on".split(" ");
//        rs.reverse(str);
//
//    }

}