package inheritance;

public class SingleInheritance {
	public static void main(String[] args) {
		B b1 = new B();
		b1.display();
		b1 = null;
	}
}




class A {
	int returnSum(int i, int j) {
		return i+j;
	}
}

class B extends A {
	void display() {
		int result = returnSum(10,20);
		System.out.println(result);
	}
}
