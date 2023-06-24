package OOP;

public class MethodLocalInnerClass {
	void outerMethod() {
		System.out.println("Inside outer method.");
		// inner class in local outer method
		class Inner{
			void innerMethod() {
				System.out.println("Inside inner method.");
			}
		}
		Inner y = new Inner();
		y.innerMethod();
	}
	
	public static void main(String[] args) {
		MethodLocalInnerClass outer = new MethodLocalInnerClass();
		outer.outerMethod();
	}
}
