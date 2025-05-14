package basic_programs;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PrintInAscendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = List.of(68,39,111,8666,92,01,68,68,111);
		
//		list.stream()
//		.sorted((a, b)->a-b)
//		.forEach((a)->System.out.print(a+" "));
		
		System.out.println(list.stream().max((a,b)->a-b).get());
		
		System.out.println(list.stream().min((a,b)->a-b).get());
		
		list.stream()
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		.entrySet()
		.stream()
		.forEach((entry)->System.out.println("'"+entry.getKey()+"'->"+entry.getValue()));
	}
}
