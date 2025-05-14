package basic_programs;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterFrequency1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "saianurag";
        
        Map<Character,Long> characterFrequency = str.chars()
        .mapToObj(c->(char)c)
        .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        
        characterFrequency.entrySet().stream()
        .filter(entry->entry.getValue()>1)
        .forEach(entry->System.out.println(entry.getKey()+"......."+entry.getValue()));
	}

}
