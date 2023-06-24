package OOP;

public class staticBinding {
	public static class superclass{
		static void print() {
			System.out.println("Hello");
		}
	}
	
	public static class subclass extends superclass{
		static void print() {
			System.out.println("Sumit");
		}
	}
	
	public static void main(String[] args) {
		superclass A = new superclass();
		superclass B = new subclass();
		A.print();
		B.print();
	}
}

