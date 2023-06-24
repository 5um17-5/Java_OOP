package OOP;

public class Encapsulation {
	private String Name;
	private int RollNo;
	private int Age;
	
	public String getName() {
		return this.Name;
	}
	
	public int getRollNo() {
		return this.RollNo;
	}
	
	public int getAge() {
		return this.Age;
	}
	
	public String setName(String name) {
		return this.Name = name;
	}
	
	public int setRollNo(int rollNo) {
		return this.RollNo = rollNo;
	}
	
	public int setAge(int age) {
		return this.Age = age;
	}	
}
