package basic_programs;

import java.util.Scanner;

public class FindLCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		
		int lcm = findLCM(a,b);
		
		System.out.println("LCM of "+a+" and "+b+" is: "+lcm);
	}

	private static int findLCM(int a, int b) {
		// TODO Auto-generated method stub
		
		int max, min, x, lcm = 0;
		if(a>b) {
			max = a;
			min = b;
		}
		else {
			max = b;
			min = a;
		}
		
		for(int i=1;i<=min;i++) {
			x = max*i;
			if(x%min==0) {
				lcm = x;
				break;
			}
		}
		
		return lcm;
	}

}
