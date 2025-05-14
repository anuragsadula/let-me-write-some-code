package basic_programs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CountOccurrencesOfN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int N = input.nextInt();
		
		ArrayList<Integer> list = new ArrayList<>();
		
		
		list.add(65);
		list.add(65);
		list.add(54);
		
		long countOccurrences = list.stream()
		.filter(i->i==N)
		.count();
		
		System.out.println(countOccurrences);
		
		input.close();
	}
}
