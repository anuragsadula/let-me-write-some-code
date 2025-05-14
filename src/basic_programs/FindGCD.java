package basic_programs;

import java.util.Scanner;

public class FindGCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		
		int gcd = findGCD(a,b);
		
		System.out.println("GCD of "+a+" and "+b+" is: "+gcd);
	}

	private static int findGCD(int a, int b) {
		// TODO Auto-generated method stub
		if(b==0) {
			return a;
		}
		return findGCD(b,a%b);
	}

}
