package OOP;

//Anonymous inner class is used to implement an interface or extending a class.
//cannot define constructor. its name decided by java compiler.

abstract class Animal{
	abstract void dog();
}

class AnynomousInnerClass {
	public static void main(String[] args) {
		Animal animal = new Animal(){
			void dog() {
				System.out.println("Dog is an animal.");
			}
		};
		animal.dog();
	}
}

