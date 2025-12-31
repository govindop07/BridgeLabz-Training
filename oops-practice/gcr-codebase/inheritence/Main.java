package inheritence;

class A {
	A() {
		System.out.println("Constructor A");
	}
	
	void display() {
		System.out.println("Display A");
	}
}

class B extends A {
	B() {
		System.out.println("Constructor B");
	}
	
	void display() {
		System.out.println("Display B");
	}
}

public class Main {
	public static void main(String[] args) {
		B obj = new B();
		obj.display();
		
	}
}
