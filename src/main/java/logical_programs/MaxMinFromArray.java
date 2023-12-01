package logical_programs;

public class MaxMinFromArray {

	public static void main(String[] args) {
		int arr[]= {10,20,90,40,50,2};
		int max=arr[0];
		int min=arr[0];
		
		for(int num:arr)
		{
			if(num>max)
				max=num;
			else if(num<min)
				min=num;
		}
		System.out.println("Maximum number from array: "+max);
		System.out.println("Minimum number from array: "+min);


	}

}
