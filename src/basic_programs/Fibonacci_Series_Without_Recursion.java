package basic_programs;

import java.util.Scanner;

public class Fibonacci_Series_Without_Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			int a = 0, b = 1, c;
			Scanner input = new Scanner(System.in);
			System.out.print("How many Fibonacci numbers do you want to print: ");
			int n = input.nextInt();
			System.out.print(a+" "+b+" ");
			for(int i=1;i<=n-2;i++) {
				
				c = a + b;
				System.out.print(c+" ");
				a = b;
				b = c;
			}
	}

}
