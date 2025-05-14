package basic_programs;

import java.util.Scanner;
import java.util.Stack;

class QueueImplementationUsingTwoStacks2 {
	
	Stack<Integer> s1 = new Stack<>();
	Stack<Integer> s2 = new Stack<>();
	
	public void push(int x) {
		
		while(!s1.empty()) {
			
			s2.push(s1.pop());
		}
		
		s2.push(x);
		
		while(!s2.empty()) {
			
			s1.push(s2.pop());
		}
	}
	
	public int pop() {
		
		return s1.pop();
	}
	
	public int peek() {
		
		return s1.peek();
	}
	
	public boolean isEmpty() {
		
		return s1.empty();
	}

}


public class ImplementQueueUsingTwoStacks2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		QueueImplementationUsingTwoStacks2 qi = new QueueImplementationUsingTwoStacks2();
		
		int q = input.nextInt();
		
		while(q-->0) {
			
			
			int query = input.nextInt();
			
			switch(query) {
				
				case 1:{
					
					int x = input.nextInt();
					qi.push(x);
					break;
				}
				
				case 2:{
					
					qi.pop();
					break;
				}
				
				case 3:{
					
					int peek = qi.peek();
					System.out.println(peek);
					break;
				}
				
				case 4:{
					
					boolean isEmpty = qi.isEmpty();
					System.out.println(isEmpty);
					break;
				}
			}
		}
	}

}
