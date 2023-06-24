package AssociationCoompositionAggregation;

public class AggregationDemo {
	public static void main(String[] args) {
		Employees e1 = new Employees("Sumit", 1, "IT operation");
		Employees e2 = new Employees("Ram", 2, "Sales");
		Employees e3 = new Employees("Shyam", 3, "Marketing");
		Employees e4 = new Employees("Priya", 4, "Designing");	
	}
}


// class employees
class Employees{
	String name;
	int id;
	String dept;
	
	Employees(String name, int id, String dept){
		this.name = name;
		this.id = id;
		this.dept = dept;
		System.out.println("Employee name is "+ name + " | Id is " + id + " | Department is " + dept);
	}
}

// class department
class Department{
	String name, employees;
	
	Department(String name, String employees){
		this.name = name;
		this.employees = employees;
	}
}

// class organization
class Organization{
	String officeName, departments;
	
	Organization(String officeName, String departments){
		this.officeName = officeName;
		this.departments = departments;
	}
}




