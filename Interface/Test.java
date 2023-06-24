package Interface;

public class Test extends Student{
	double p1, p2;
	
	void putMarks(double x, double y) {
		this.p1 = x;
		this.p2 = y;
	}
	
	void showMarks() {
		System.out.println("Test1 = " + p1);
		System.out.println("Test2 = " + p2);
	}
}
