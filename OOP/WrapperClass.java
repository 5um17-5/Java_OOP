package OOP;

public class WrapperClass {
	public static void main(String[] args) {
		String i = "10";
		int k = Integer.parseInt(i);
		double m = Double.parseDouble("10");
		System.out.println(i); // string
		System.out.println(k); // integer
		System.out.println(m); // double
		boolean status = Boolean.parseBoolean("20"); 
		System.out.println(status); // boolean
		
		int a = 100; // primitive data type
		Integer I = a; // autoboxing will occur internally
		System.out.println(I);
		
		@SuppressWarnings("removal")
		Integer b = new Integer(15); // wrapper class object;
		int E = b; // unboxing will occur internally.
		System.out.println(E);
	}
}
