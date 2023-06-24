package polymorphism;

public class dynamicpolymorphism {
	 void connect() {
		
	}
}

class oracle extends dynamicpolymorphism{
	void connect() {
		System.out.println("oracle connected");
	}
}

class mysql extends dynamicpolymorphism{
	void connect() {
		System.err.println("mysql connected");
	}
}
