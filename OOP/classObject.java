package OOP;

public class classObject {
	String name;
	int age;
	double height;
	
	public classObject(String name, int age, double height) {
		this.name = name;
		this.age = age;
		this.height = height;
	}
	
	public void show() {
		System.out.println(name + " " + age + " " + height);
	}
}
