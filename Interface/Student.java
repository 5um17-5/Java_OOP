package Interface;

public class Student {
	int roll;
	
	void getDate(int p) {
		roll = p;
	}
	
	void display() {
		System.out.println("Roll no is: " + roll);
	}
}
