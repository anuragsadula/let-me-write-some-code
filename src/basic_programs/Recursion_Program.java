package basic_programs;

import java.util.Scanner;

class Test_class{

	public static void print1ToN(int n) {
		// TODO Auto-generated method stub
	
		if(n==0)
			return;
		else {
			print1ToN(n-1);
			System.out.print(n+" ");
		}
	}
	
}

public class Recursion_Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		Test_class.print1ToN(n);
	}

}
