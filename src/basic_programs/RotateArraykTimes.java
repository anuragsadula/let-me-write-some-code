package basic_programs;

import java.util.Scanner;

public class RotateArraykTimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the array size: ");
		
		int n = input.nextInt();
		int[] arr = new int[n];
		
		System.out.println("Enter "+n+" integers: ");
		
		for(int i=0;i<n;i++) {
			arr[i] = input.nextInt();
		}
		
		System.out.println("Enter an integer for how many times an array should be rotated: ");
		int k = input.nextInt();
		
		rotateArray(arr,k);
		
		System.out.println("Array after rotating "+k+" times:");
		
		for(int j=0;j<n;j++) {
			System.out.print(arr[j]+" ");
		}
		
		input.close();
	}

	private static void rotateArray(int[] arr, int k) {
		// TODO Auto-generated method stub
		
		int n = arr.length;
		
		k = k%n;
		
		rotate(arr,0,k-1);
		rotate(arr,k,n-1);
		rotate(arr,0,n-1);
		
	}

	private static void rotate(int[] arr, int start, int end) {
		// TODO Auto-generated method stub
		
		while(start<end) {
			
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			
			start++;
			end--;
		}
	}

}
