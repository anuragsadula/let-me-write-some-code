package basic_programs;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int arr[] = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i] = input.nextInt();
		}
		
		int k = input.nextInt();
		int resultArr[] = new int[n];
		
		for(int j=0;j<k;j++) {
			int count = 0;
			for(int r = n-1;r<n;r++) {
				if(r==n) {
					r = 0;
					resultArr[count] = arr[r];
					count++;
				}else {
					resultArr[count] = arr[r];
					count++;
				}
				
			}
		}
		
//		int b = 0;
//		for(int j=0;j<n;j++) {
//			k = j+1;
//			if(j==n-1) {
//				resultArr[0] = arr[n-1];
//			}
//			else {
//				resultArr[k] = arr[j];
//			}
//		}
		
		for(int a=0;a<n;a++) {
			System.out.print(resultArr[a]+" ");
		}
		
	}

}
