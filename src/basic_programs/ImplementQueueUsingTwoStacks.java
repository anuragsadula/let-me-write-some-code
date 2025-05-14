package basic_programs;

import java.util.Stack;

class QueueImplementationUsingTwoStacks{
	
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
	
	public int top() {
		
		return s1.peek();
	}
	
	public boolean isEmpty() {
		
		return s1.empty();
	}
}

public class ImplementQueueUsingTwoStacks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		QueueImplementationUsingTwoStacks q = new QueueImplementationUsingTwoStacks();
		
		q.push(56);
		q.push(546);
		q.push(121);
		q.push(212);
		
		//System.out.println(q.top());
		
		System.out.println(q.pop());
		System.out.println(q.pop());
		System.out.println(q.pop());
		System.out.println(q.pop());
		System.out.println(q.isEmpty());
		
	}

}
