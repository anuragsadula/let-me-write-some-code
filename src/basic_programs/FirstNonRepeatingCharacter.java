package basic_programs;

import java.util.HashMap;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Aapple";
		
		//str = str.toLowerCase();
		
		HashMap<Character, Integer> hm = new HashMap<>();
		
		for(int i=0;i<str.length();i++) {
			
			if(hm.containsKey(str.charAt(i))) {
				
				int value = hm.get(str.charAt(i));
				hm.put(str.charAt(i), value+1);
			}
			else {
				
				hm.put(str.charAt(i), 1);
			}
		}
		
		char firstNonRepeatingCharacter = 0;
		
		for(int j=0;j<str.length();j++) {
			
			if(hm.get(str.charAt(j))==1) {
				
				firstNonRepeatingCharacter = str.charAt(j);
				break;
			}
		}
		
		System.out.println(firstNonRepeatingCharacter);
	}

}
