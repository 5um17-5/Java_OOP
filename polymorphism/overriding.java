package polymorphism;

// class overriding extends dynamicpolymorphism if these are not in same package
public class overriding{
	public static void main(String[] args) {
		oracle a1 = new oracle();
		mysql b1 = new mysql();
		a1.connect();
		b1.connect();		
	}
}
