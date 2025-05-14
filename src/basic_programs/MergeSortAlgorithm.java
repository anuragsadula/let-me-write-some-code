package basic_programs;

import java.util.Scanner;

class MergeSort{

	public void mergeSort(int[] arr, int l, int r) {
		// TODO Auto-generated method stub
		if(l<r){
			int mid = l+(r-l)/2;
			mergeSort(arr,l,mid);
			mergeSort(arr,mid+1,r);
			merge(arr,l,mid,r);
		}
	}

	public void merge(int[] arr, int l, int mid, int r) {
		// TODO Auto-generated method stub
		
		int i=l, j = mid+1, k = l;
		
		int[] temp = new int[r-l+1];
		
		while(i<=mid && j<=r) {
			if(arr[i]<=arr[j]){
				temp[k] = arr[i];
				i++;
				k++;
			}
			else {
				temp[k] = arr[j];
				j++;
				k++;
			}
		}
		
		while(i<=mid) {
			temp[k] = arr[i];
			i++;
			k++;
		}
		
		while(j<=r) {
			temp[k] = arr[j];
			j++;
			k++;
		}
		
		for(int p=0;p<=r-l;p++) {
			arr[p+l] = temp[p];
		}
	}
	
}

public class MergeSortAlgorithm {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int n = input.nextInt();
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++){
			arr[i] = input.nextInt();
		}
		
		MergeSort obj = new MergeSort();
		
		obj.mergeSort(arr,0,arr.length-1);
		
		System.out.print("Array after sorting: ");
		
		for(int a=0;a<n;a++){
			System.out.print(arr[a]+" ");
		}
	}
}
