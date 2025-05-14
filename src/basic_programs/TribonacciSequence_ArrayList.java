package basic_programs;

import java.util.ArrayList;
import java.util.Scanner;

class Demo1{

	public static ArrayList getTribonacciSeq(int n) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList();
		int a = 0, b = 1, c = 2, d;
		al.add(a);
		al.add(b);
		al.add(c);
		
		for(int i=1;i<=n-3;i++) {
			d = a+b+c;
			al.add(d);
			a = b;
			b = c;
			c = d;
		}
		return al;
	}
	
}

public class TribonacciSequence_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of elements: ");
		int n = input.nextInt();
		
		System.out.print(Demo1.getTribonacciSeq(n));
	}

}
