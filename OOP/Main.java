package OOP;

public class Main {
	public static void main(String[] args) {
		// class and object
		classObject createObject = new classObject("sumit", 32, 5.4);
		createObject.show();
		
		System.out.println(); 
		
		// constructor
		constructorEg ce = new constructorEg("Sumit", 2); // parameterized constructor
		ce.show();
		constructorEg cd = new constructorEg(); // default constructor
		cd.show();
		constructorEg cc = new constructorEg(createObject); // copy constructor
		cc.show();
		constructorEg cz = new constructorEg(ce); // copy constructor
		cz.show();
		
		System.out.println();
		
		// this keyword for variable hiding
		thiskeyword tk = new thiskeyword();
		tk.method(20);
		thiskeyword tv = new thiskeyword();
		tv.method();
		
		System.out.println();
		
		// super keyword in inheritance superclass -> college and subclass -> student
		college myCollege = new college();
		myCollege.collegeRecord();
		student std = new student();
		std.collegeRecord();
		std.studentRecord();
		System.out.println(std.collegeName);
		System.out.println(myCollege.collegeName);
		
		System.out.println();
		
		//constructor overloading
		System.out.println("Roll\tName\tMarks");
		student1 std1 = new student1("sumit",1,94.30);
		student1 std2 = new student1(78.90,2,"Ram");
		std1.display();
		std2.display();
		
		System.out.println();
		
		// Encapsulation
		Encapsulation stud1 = new Encapsulation();
		stud1.setName("Sumit shrestha");
		stud1.setRollNo(1);
		stud1.setAge(32);
		System.out.println("----Student info----");
		System.out.println("Name: " + stud1.getName() + "\nRoll No: " + stud1.getRollNo() + "\nAge: " + stud1.getAge());
		
		System.out.println();
		
		// importance of encapsulation
		account acc = new account();
		acc.setBalance(-100);
		acc.deposit(-100);
		System.out.println("Account balance is :" + acc.getBalance());
		
	}
}
