
class Member{

	String name, address;
	int age, salary;

	void salary(){
		System.out.println("Salary = "+salary);
	}

	void setDetails(String name, String address, int age, int salary){

		this.name=name;
		this.address=address;
		this.age=age;
		this.salary=salary;
	}

	void printDetails(){

		System.out.println("Name: "+name+" Age: "+age+" Address: "+address+" Salary: " +salary);
	}
}

class Employee extends Member{
	
	String specialization;

	Employee( String spe){

		specialization=spe;
	}
	
}

class Manager extends Member{

	String department;

	Manager(String department){

		this.department=department;
	}
}

class Inheritance{

	public static void main(String args[]){

	Employee e = new Employee("App Development");
	
	Manager m = new Manager("IT");

	e.setDetails("Janvi","Gandhinagar", 20, 80000);

	m.setDetails("John", "Ahmedabad", 25, 100000);

	e.printDetails();
	m.printDetails();
	}
}



