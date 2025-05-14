package basic_programs;

import java.util.List;
import java.util.stream.Collectors;

public class NameStartsWithA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> name = List.of("Anurag","Ashritha","Alekhya","Chandana","Vishnu");
		
		List<String> result = name.stream().filter(s->s.startsWith("A")).map(s->s.toUpperCase()).collect(Collectors.toList());
		
		System.out.println(result);
	}

}
