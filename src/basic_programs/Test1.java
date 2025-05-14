package basic_programs;

import java.util.List;
import java.util.stream.Collectors;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = List.of(45,55,79,166,5,65,16,9);
		
		List<Integer> listStream = list.stream()
				.sorted((Integer a,Integer b)->b-a)
				.limit(2)
				.collect(Collectors.toList());
		
		System.out.println(listStream);
	}

}
