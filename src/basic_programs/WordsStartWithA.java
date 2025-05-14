package basic_programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WordsStartWithA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> words = Arrays.asList("Anurag","Aravindha","Amrapaali","Ravi","Munny","Chandana","Chinny","America");
		
		List<String> wordsStream = words.stream().filter((String s)->s.charAt(0)=='A').collect(Collectors.toList()); 
		
		System.out.println(wordsStream);
	}
}
