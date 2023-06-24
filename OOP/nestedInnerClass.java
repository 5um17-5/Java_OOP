package OOP;

public class nestedInnerClass {
	class inner{
		void show() {
			System.out.println("In a nested class method.");
		}
	}
	
	public static void main(String[] args) {
		nestedInnerClass.inner in = new nestedInnerClass().new inner();
		in.show();
	}
}
