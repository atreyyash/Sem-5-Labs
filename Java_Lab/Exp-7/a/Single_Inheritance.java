import java.util.*;
/**
 * Single_Inheritance
 */
class student{
    
    int id;
    String name;
    Scanner s = new Scanner(System.in);
    student(){
        id = 00;
        name = "Default";
    }
    public void getStu()
    {
        System.out.print("Enter Student Id : ");
        id = s.nextInt();
        System.out.print("Enter Student Name : ");
        name = s.next();
    }
    
    public void putstu(){
        System.out.println("Students Details : ");
        System.out.println("Id : "+ id);
        System.out.println("Name : "+name);
    }
}

class phydetails extends student{
    float height;
    float weight;
    Scanner s = new Scanner(System.in);
    phydetails(){
        height = 140;
        weight = 50;
    }
    public void getphy(){
        System.out.print("Enter Height : ");
        height = s.nextFloat();
        System.out.print("Enter Weight : ");
        weight = s.nextFloat();
    }
    public void putphy(){
        System.out.println("Student's Physical Details are : ");
        System.out.println("Height : "+height);
        System.out.println("Weight : "+weight);
    }
}

public class Single_Inheritance {
    public static void main(String[] args) {
        phydetails p1 = new phydetails();
        phydetails p2 = new phydetails();
        p1.getStu();
        p1.getphy();
        p2.getStu();
        p2.getphy();

        p1.putstu();
        p1.putphy();

        p2.putstu();
        p2.putphy();
    }
}