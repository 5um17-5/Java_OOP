package Interface;

public class Circle implements Shapes {
	int radius = 10;

	public double area() {
		return (Math.PI * radius * radius);
	}

	public double volume() {
		return 0;
	}
	
}
