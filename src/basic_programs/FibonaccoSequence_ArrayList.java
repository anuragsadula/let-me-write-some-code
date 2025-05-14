package basic_programs;

import java.util.ArrayList;
import java.util.Scanner;

class Demo{

	public static ArrayList getFibSeq(int n) {
		// TODO Auto-generated method stub
			ArrayList<Integer> al = new ArrayList();
			int a = 0, b = 1, c;
			al.add(a);
			al.add(b);
			
			for(int i=1;i<=n-2;i++) {
				c = a+b;
				al.add(c);
				a = b;
				b = c;
			}
			
			return al;		
		}
}

public class FibonaccoSequence_ArrayList {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of elements: ");
		int n = input.nextInt();
		System.out.print(Demo.getFibSeq(n));
	}

}
