package inheritance;

public class HierarchicalInheritance {
	public static void main(String[] args) {
		three g = new three();
		g.print_hello();
		two t = new two();
		t.print_world();
		g.print_hello();
	}
}


// class one is super class
class one {
	void print_hello() {
		System.out.println("Hello");
	}
}

// class two is subclass of class one
class two extends one{
	void print_world() {
		System.out.println("World");
	}
}

// class three is also subclass of class one
class three extends one{
//	................
}

