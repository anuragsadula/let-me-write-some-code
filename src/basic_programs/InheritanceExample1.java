package basic_programs;

class A{
	
	public void print() {
		
		System.out.println("Parent class print()");
	}
}

class B extends A{
	
	public void print() {
		
		System.out.println("Child class print()");
	}
	
	public void display() {
		
		System.out.println("Child class display()");
	}
}

public class InheritanceExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A a = new A();
		a.print();
		
		
		A a1 = new B();
		
		a1.print();
		
		B b = new B();
		
		b.print();
		b.display();
		
		
	}

}
