package basic_programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class SortGivenIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> numbers = Arrays.asList(2,1,4,7,10);
		
		System.out.print("Ascending Order: ");
		numbers.stream().sorted().forEach((Integer val)->System.out.print(val+" "));
		
		System.out.println();
		
		System.out.print("Descending Order: ");
		numbers.stream().sorted((Integer val1,Integer val2)->val2-val1).forEach((Integer val)->System.out.print(val+" "));
		
		
	}

}
