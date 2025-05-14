package basic_programs;

import java.util.Scanner;

public class CheckArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		int count = 0, temp = n, originalNumber = n;
		
		while(temp!=0) {
			count++;
			temp = temp/10;
		}
		
		double sumofpower = 0;
		
		while(n!=0) {
			int digit = n%10;
			sumofpower = sumofpower+Math.pow(digit, count);
			n = n/10;
		}
		
		if(originalNumber==sumofpower) {
			System.out.println(originalNumber+" is a Armstrong Number");
		}
		else {
			System.out.println(originalNumber+" is not a Armstrong Number");
		}
	}

}
