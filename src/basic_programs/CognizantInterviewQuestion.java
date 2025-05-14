package basic_programs;

import java.util.HashMap;

public class CognizantInterviewQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "sadula sai anurag";

		HashMap<Character,Integer> hm = new HashMap<>();

		for(int i=0;i<name.length();i++){
			
			if(hm.containsKey(name.charAt(i))){
				
				int value = hm.get(name.charAt(i));
				hm.put(name.charAt(i),value+1);
			}
			
			else{
				
				hm.put(name.charAt(i),1);
			}
		}
		
		if(hm.containsKey(' ')) {
			hm.remove(' ');
		}
			
		for(int j=0;j<name.length();j++){
			
			if(hm.containsKey(name.charAt(j))){
				System.out.println(name.charAt(j)+": "+hm.get(name.charAt(j)));
				hm.remove(name.charAt(j));
			}
		}
	}

}
