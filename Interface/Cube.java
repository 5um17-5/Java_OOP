package Interface;

public class Cube implements Shapes {
	int x = 10;
	public double area() {
		return (6 * x * x);
	}
	public double volume() {
		return (x * x * x);
	}
}
