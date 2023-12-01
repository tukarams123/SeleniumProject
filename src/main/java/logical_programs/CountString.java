package logical_programs;

public class CountString {

	public static void main(String[] args) {
		String str = "I am capable of doing any work @%1234";
		int digits = 0, letters = 0, whitespaces = 0, special = 0;
		for (char ch : str.toCharArray()) {
			if (Character.isLetter(ch)) {
				letters++;
			} else if (Character.isWhitespace(ch)) {
				whitespaces++;
			} else if (Character.isDigit(ch)) {
				digits++;
			} else {
				special++;
			}
		}
		System.out.println("No. of letters - "+letters);
		System.out.println("No. of spaces - "+whitespaces);
		System.out.println("No. of digits - "+digits);
		System.out.println("No. of special characters - "+special);

	}

}
