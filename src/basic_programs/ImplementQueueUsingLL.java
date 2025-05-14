package basic_programs;

class NodeLL{
	
	NodeLL next;
	int data;
	
	public NodeLL(int data) {
		
		this.data = data;
		this.next = null;
	}
}

class QueueImplementationUsingLL{
	
	NodeLL top;
	int size;
	
	public QueueImplementationUsingLL() {
		// TODO Auto-generated constructor stub
		
		this.top = null;
		this.size = 0;
	}
	
	
	public void push(int x) {
		
		NodeLL n = new NodeLL(x);
		
		if(top==null) {
			
			top = n;
		}
		else {
			
			NodeLL temp = top;
			
			while(temp.next!=null) {
				temp = temp.next;
			}
			
			temp.next = n;
		}
		
		size++;
	}
	
	public int poll() {
		
		NodeLL temp = top;
		int value = top.data;
		top = temp.next;
		temp = null;
		size--;
		
		return value;
	}
	
	public int peek() {
		
		return top.data;
	}
	
	public boolean isEmpty() {
		
		return (size==0);
	}
}

public class ImplementQueueUsingLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		QueueImplementationUsingLL q = new QueueImplementationUsingLL();
		
		q.push(50);
		q.push(40);
		q.push(30);
		q.push(20);
		q.push(10);
		
		System.out.println(q.peek());
		
		System.out.println(q.poll());
		System.out.println(q.poll());
		System.out.println(q.poll());
		System.out.println(q.poll());
		System.out.println(q.poll());
		
		System.out.println(q.isEmpty());
		

	}

}
