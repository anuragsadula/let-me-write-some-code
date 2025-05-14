package basic_programs;

import java.util.LinkedList;
import java.util.Queue;

class StackUsingTwoQueues{
	
	Queue<Integer> q1 = new LinkedList<>();
	Queue<Integer> q2 = new LinkedList<>();
	
	public void push(int x) {
		
		q2.add(x);
		
		while(!q1.isEmpty()) {
			
			q2.add(q1.poll());
		}
		
		q1.addAll(q2);
		
		System.out.println("After adding all the elements to q1 from q2: "+q1);
		
		q2.removeAll(q1);
		
		System.out.println("After removing all the elements in q2 from q1: "+q2);
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
public class ImplementStackUsingTwoQueues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StackUsingTwoQueues sq = new StackUsingTwoQueues();
		
		sq.push(4256);
		sq.push(951);
		sq.push(856);
		sq.push(144);
		sq.push(956);
		sq.push(861);
		

		System.out.println(sq.pop());
		System.out.println(sq.top());
		
		System.out.println(sq.isEmpty());
	}

}
