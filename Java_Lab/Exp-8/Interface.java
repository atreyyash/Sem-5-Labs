class Person {
	String name;
	int age;

	void display() {
		System.out.println("Name: " + name + "\nAge: " + age);
	}

	Person(int Age, String Name) {
		name = Name;
		age = Age;
	}
}

class Student extends Person {
	Student(int age, String name, int roll, String b) {
		super(age, name);
		rollno = roll;
		branch = b;
	}

	int rollno;
	String branch;

	void display() {
		super.display();
		;
		System.out.println("Roll No: " + rollno + "\nBranch: " + branch);
	}
}

class Employee extends Person {
	Employee(int age, String name, int Ecn, String Dj) {
		super(age, name);
		Ecno = Ecn;
		Doj = Dj;
	}

	int Ecno;
	String Doj;

	void display() {
		super.display();
		System.out.println("EC no.: " + Ecno + "\nDate of joining: " + Doj);
	}
}

class Faculty extends Employee {
	Faculty(int age, String name, int Ecn, String Dj, String D) {
		super(age, name, Ecn, Dj);
		desig = D;
	}

	String desig;

	void display() {
		super.display();
		System.out.println("\nDesignation: " + desig);
	}
}

class Staff extends Employee {
	Staff(int age, String name, int Ecn, String Dj, String D) {
		super(age, name, Ecn, Dj);
		desig = D;
	}

	String desig;

	void display() {
		super.display();
		System.out.println("\nDesignation: " + desig);
	}
}

public class Interface {
	public static void main(String[] args) {

		Staff ob1 = new Staff(25, "Aman", 8001, "12/07/2007", "Clerical");
		Faculty ob2 = new Faculty(35, "Achal Sir", 1001, "22/06/2003", "Professor");
		Employee ob3 = new Employee(40, "Arjun", 4001, "10/08/2009");
		Student ob4 = new Student(18, "Hrithik", 26, "CSE");
		Person ob5 = new Person(23, "Yash");

		System.out.println("Class Staff");
		ob1.display();
		System.out.println("\nClass Faculty");
		ob2.display();
		System.out.println("\nClass Employee");
		ob3.display();
		System.out.println("\nClass Student");
		ob4.display();
		System.out.println("\nClass Person");
		ob5.display();

	}
}