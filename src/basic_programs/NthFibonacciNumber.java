package basic_programs;

import java.util.Scanner;

class Test{

	public static int nthFibonacciNumber(int n) {
		// TODO Auto-generated method stub
		
		if(n==0)
			return 0;
		if(n==1)
			return 1;
		
		return nthFibonacciNumber(n-1)+nthFibonacciNumber(n-2);
	}
	
}

public class NthFibonacciNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		int result = Test.nthFibonacciNumber(n);
		
		System.out.println("Fibonacci Number of "+n+" is: "+result);
	}
}