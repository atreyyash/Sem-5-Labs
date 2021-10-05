class Name{
    String firstName;
    String middleName;
    String lastName;

    public Name(String fname, String mname, String lname){
        this.firstName = fname;
        this.middleName = mname;
        this.lastName = lname;
    }
}

class EmployeeExam{
    int age;
    Name n;
    public void display(int age, Name n){
        System.out.println("Age : " + age);
        System.out.println("Full Name : "+n.firstName+ " "+n.middleName+" "+n.lastName);
    }
}

public class Has_a_relation {
    public static void main(String[] args) {
        EmployeeExam e = new EmployeeExam();
        Name n = new Name("Yash", "", "Atrey");
        e.display(20, n);
    }
}