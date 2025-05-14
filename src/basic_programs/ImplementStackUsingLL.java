package basic_programs;

class Node{
	
	Node next;
	int data;
	
	public Node(int data) {
		
		this.data = data;
		this.next = null;
	}
}

class StackImplementationUsingLL{
	
	Node top;
	int size = 0;
	
	public StackImplementationUsingLL() {
		// TODO Auto-generated constructor stub
		
		this.top = null;
	}
	
	public void push(int x) {
		
		Node n = new Node(x);
		n.next = top;
		top = n;
		size++;
	}
	
	public int pop() {
		
		int value = top.data;
		Node temp = top;
		top = temp.next;
		temp = null;
		size--;
		return value;
		
	}
	
	public int peek() {
		
		return top.data;
	}
	
	public boolean empty() {
		
		return (size==0);
	}
}


public class ImplementStackUsingLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StackImplementationUsingLL s = new StackImplementationUsingLL();
		
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		
		System.out.println(s.peek());
		
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		
		System.out.println(s.empty());
	}

}
