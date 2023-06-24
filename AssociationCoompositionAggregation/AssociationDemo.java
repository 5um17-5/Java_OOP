package AssociationCoompositionAggregation;

// association between class and the main method
public class AssociationDemo {
	public static void main(String[] args) {
		College college = new College("National Integrated College");
		Student student = new Student("Sumit shrestha");
		System.out.println(student.getStudentName() + " is student of " + college.getCollegeName() + ".");
	}
}

// class college
class College {
	private String name;
	
	College(String name){
		this.name = name;
	}
	
	public String getCollegeName() {
		return this.name;
	}
}


// class student
class Student {
	private String name;
	
	Student(String name){
		this.name = name;
	}
	
	public String getStudentName() {
		return this.name;
	}
}