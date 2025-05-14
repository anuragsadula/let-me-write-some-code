package basic_programs;

import java.util.Stack;

class Solution {
	
    public boolean isValid(String str) {

        Stack<Character> s = new Stack<>();

        for(int i=0;i<str.length();i++){

            if(str.charAt(i)=='{'||str.charAt(i)=='(' || str.charAt(i)=='['){

                s.push(str.charAt(i));
            }
            else{

//                if(s.isEmpty()){
//            
//                    return false;
//                }   

                if((str.charAt(i)=='}' && s.peek()=='{') || (str.charAt(i)==')' && s.peek()=='(') || (str.charAt(i)==']' && s.peek()=='[')){
                    
                    s.pop();
                }
                else
                    return false;
            }   
        }

        return s.isEmpty();
    }
}

public class ParanthesisCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Solution s = new Solution();
		
		String str = "[{()}]";
			
		System.out.println(s.isValid(str));
		
	}

}
