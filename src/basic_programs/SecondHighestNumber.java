package basic_programs;

import java.util.Arrays;
import java.util.Scanner;

public class SecondHighestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++){
			arr[i] = input.nextInt();
		}
		
		Arrays.sort(arr);
		
		int result = arr[arr.length-2];
		
		System.out.println("Second largest number is: "+result);

	}

}

