package AbstractClass;

public class Main {
	public static void main(String[] args) {
		Bank b;
		b = new SBI();
		System.out.println("SBI rate of interest is: " + b.getRateOfInterest()+"%");
		b = new PNB();
		System.out.println("PNB rate of interest is: " + b.getRateOfInterest()+"%");
	}
}
