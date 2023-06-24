package Interface;

public class Results extends Test implements Sports {
	double total;
	
	public void showWeight() {
		System.out.println("Weight = " + weight);
	}
	
	void displayAll() {
		total = p1 + p2 + weight;
		display();
		showMarks();
		showWeight();
		System.out.println("The total is : " + total);
	}
}
