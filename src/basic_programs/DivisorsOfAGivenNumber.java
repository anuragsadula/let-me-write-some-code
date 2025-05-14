package basic_programs;

import java.util.Scanner;

public class DivisorsOfAGivenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		printDivisorsOptimal(n);
		
	}

	private static void printDivisorsOptimal(int n) {
		// TODO Auto-generated method stub
		
		System.out.print("The divisors of "+n+" are: ");
		
		for(int i=1;i<=(int)(Math.sqrt(n));i++) {
			if(n%i==0) {
				System.out.print(i+" ");
				if(i!=n/i) {
					System.out.print(n/i+" ");
				}
			}
		}
	}

}
