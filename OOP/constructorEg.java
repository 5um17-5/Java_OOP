package OOP;

public class constructorEg {
	String name;
	int id;
	
	// Parameterized constructor
	public constructorEg(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	// default constructor
	public constructorEg() {
		// no argurment constructor
		System.out.println("no argurement constructor");
	}
	
	// copy constructor
	public constructorEg(classObject co) {
		this.name = co.name;
	}
	public constructorEg(constructorEg cz) {
		this.name = cz.name;
		this.id = cz.id;
	}
	
	public void show() {
		System.out.println(name + ", " + id);
	}
}
