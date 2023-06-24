package OOP;

public class student1 {
	String name;
	int roll;
	double marks;
	
	public student1(String name, int roll, double marks) {
		this.name = name;
		this.roll = roll;
		this.marks = marks;
	}
	
	public student1(double marks, int roll, String name) {
		this.marks = marks;
		this.roll = roll;
		this.name = name;
	}
	
	public void display() {
		System.out.println(roll + "\t" + name + "\t" + marks );
	}
}
