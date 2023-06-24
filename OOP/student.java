package OOP;

public class student extends college {
	// student is subclass or child class of superclass college
	public void studentRecord() {
		super.collegeRecord();
		super.collegeName = "Nepal hss";
		System.out.println("The student of this college is performing good in academics.");
	}
}
