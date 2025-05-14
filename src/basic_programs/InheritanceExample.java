package basic_programs;

class ParentClass{
	
	public void method1() {
		
		System.out.println("Parent class method");
	}
}

class ChildClass extends ParentClass{

	public void method1() {
		
		System.out.println("Child class method");
	}
}

public class InheritanceExample{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ParentClass p1 = new ParentClass();
		p1.method1();
		
		ParentClass p2 = new ChildClass();
		p2.method1();
		
		ChildClass c1 = new ChildClass();
		c1.method1();
	
	}
}
