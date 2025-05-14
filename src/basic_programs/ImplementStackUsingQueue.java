package basic_programs;

import java.util.LinkedList;
import java.util.Queue;

class StackImplementationUsingQueue{
	

	Queue<Integer> q1 = new LinkedList<>();
	
	
	public void push(int x) {
		
		q1.add(x);
		
		for(int i=0;i<q1.size()-1;i++) {
			
			q1.add(q1.poll());
		}
	}
	
	public int pop() {
	
		return q1.poll();
	}
	
	public int top() {
		
		return q1.peek();
	}
	
	public boolean isEmpty() {
		
		return q1.isEmpty();
	}
}

public class ImplementStackUsingQueue {
	
	public static void main(String[] args) {
		
		StackImplementationUsingQueue q = new StackImplementationUsingQueue();
		
		q.push(2);
		q.push(1);
		q.push(5);
		q.push(9);
		
		System.out.println(q.top());
		System.out.println(q.pop());
		System.out.println(q.top());
		System.out.println(q.isEmpty());
		
		System.out.println(q.pop());
		System.out.println(q.pop());
		System.out.println(q.pop());
		
		System.out.println(q.isEmpty());
		
	}
}
