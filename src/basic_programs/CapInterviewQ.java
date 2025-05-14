package basic_programs;

import java.util.Stack;

//Reverse String without changing the special character. i/p : ab#cd%ef@ o/p : fe#dc%ba@.
//ip:abc

public class CapInterviewQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "abc";
		
		//int i = 0, j = s.length()-1;
		
		String reversedString = "";
		
		for(int i=s.length()-1;i>=0;i--) {
			
			reversedString = reversedString+s.charAt(i);
		}
		
		System.out.println(reversedString);
	}

}
