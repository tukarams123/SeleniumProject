package logical_programs;

import java.util.Arrays;

public class FindTheMaximumNumberFromGivenString {

	public static void main(String[] args) {

		String str = "12,56,78,98,14";
		String[] s = str.split(",");

		//System.out.println(s[0]);
		int arr[] = new int[5];
		for (int i = 0; i < 5; i++) {
			arr[i] = Integer.parseInt(s[i]);
			System.out.println(arr[i]);
		}
		System.out.println(Arrays.toString(arr));
		int max=arr[0];
		for(int i=0;i<arr.length-1;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
		}
		System.out.println("Maximum number from given string: "+max);
	}

}
