package basic_programs;

import java.util.HashMap;
import java.util.Scanner;

public class FindFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		String str = input.next();
		
		str = str.toLowerCase();
		
		HashMap<Character,Integer> hm = new HashMap<>();
		
		for(int i=0;i<str.length();i++) {
			if(hm.containsKey(str.charAt(i))){
				int value = hm.get(str.charAt(i));
				hm.put(str.charAt(i), value+1);
			}
			else {
				hm.put(str.charAt(i),1);
			}
		}
		
		for(char c='z';c>='a';c--){
			if(hm.containsKey(c)){
				int frequency = hm.get(c);
				System.out.println(c+" - "+frequency);
			}
			//System.out.println();
		}
	}

}
