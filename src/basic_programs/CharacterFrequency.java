package basic_programs;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "sadula sai anurag";
		
		Map<Character,Long> characterFrequency = str.chars()
				.filter(c->c!=' ')
				.mapToObj(c->(char)c)
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		characterFrequency.forEach((character,frequency)->System.out.println("'"+character+"'->"+frequency));
	}

}
