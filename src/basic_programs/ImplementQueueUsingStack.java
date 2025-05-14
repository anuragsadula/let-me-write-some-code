package basic_programs;

import java.util.Stack;

class QueueImplementationUsingStack{
	
	Stack<Integer> stack = new Stack<>();
	
	public void add(int x) {
		
		stack.add(x);
		
		for(int i=0;i<stack.size()-1;i++) {
			
			stack.add(stack.get(i));
			
			stack.remove(i);
		}
	}
	
	public int top() {
		
		return stack.peek();
	}
	
	public void remove() {
		
		stack.pop();
	}
	
	public boolean isEmpty() {
		
		return stack.isEmpty();
	}
}

public class ImplementQueueUsingStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		QueueImplementationUsingStack q = new QueueImplementationUsingStack();
		
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(40);
		q.add(50);
		
		System.out.println(q.top());
		
		System.out.println(q.isEmpty());
		
		q.remove();
		
		System.out.println(q.top());
			
	}

}
