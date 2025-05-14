package basic_programs;

import java.util.Stack;

class QueueImplementationUsingIpOpStacks{
	
	Stack<Integer> ip = new Stack<>();
	Stack<Integer> op = new Stack<>();
	
	public void push(int x) {
		ip.push(x);
	}
	
	public int pop() {
		
		if(!op.empty()) {
			
			return op.pop();
		}
		else {
			
			while(!ip.empty()) {
				op.push(ip.pop());
			}
			
			return op.pop();
		}
	}
	
	public int top() {
		
		if(!op.empty()) {
			
			return op.peek();
		}
		else {
			
			while(!ip.empty()) {
				
				op.push(ip.pop());
			}
			
			return op.peek();
		}
	}
	
	public boolean isEmpty() {
		
		return ip.empty() && op.empty();
	}
}

public class ImplementQueueUsingIpOpStacks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		QueueImplementationUsingIpOpStacks q = new QueueImplementationUsingIpOpStacks();
		
		q.push(56);
		q.push(546);
		q.push(121);
		q.push(212);
		
		//System.out.println(q.top());
		
		System.out.println(q.pop());
		System.out.println(q.pop());
		System.out.println(q.pop());
		System.out.println(q.pop());
		
		q.push(65);
		
		System.out.println(q.isEmpty());
	}

}
