package OOP;

public class StaticNestedClass {
	static class NestedDemo{
		public void myMethod() {
			System.out.println("This is static nested class.");
		}
	}
	
	public static void main(String[] args) {
		StaticNestedClass.NestedDemo nested = new StaticNestedClass.NestedDemo();
		nested.myMethod();
	}
}
