package basic_programs;

import java.util.Scanner;

public class SortAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++) {
			
			arr[i] = input.nextInt();
		}
		
		for(int j=1;j<n;j++) {
			
			int k = j-1;
			int currentElement = arr[j];
			
			while(k>=0 && arr[k]>currentElement){
				
				arr[k+1] = arr[k];
				k = k-1;
			}
			
			arr[k+1] = currentElement;
		}
		
		System.out.print("Array after sorting: ");
		
		for(int j=0;j<n;j++) {
			
			System.out.print(arr[j]+" ");
		}
	}

}
