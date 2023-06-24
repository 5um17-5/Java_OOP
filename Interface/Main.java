package Interface;

public class Main {
	public static void main(String[] args) {
		// interface shapes
		Shapes s1 = new Cube();
		System.out.println("The area of cube is : " + s1.area());
		System.out.println("The volume of cube is : " + s1.volume());
		Shapes s2 = new Circle();
		System.out.println("The area of circle is : " + s2.area());
		System.out.println("The volume of circle is : " + s2.volume());
		
		System.out.println();
		
		// interface sport and class student result
		Results res = new Results();
		res.getDate(101); // put roll no
		res.putMarks(55.5, 77.8); // put marks in test
		res.displayAll();
		
	}
}
