class Car{
    public Car()
    {
     System.out.println("Class Car");
    }
    public void vehicleType()
    {
     System.out.println("Vehicle Type: Car");
    }
 }
 class Maruti extends Car{
    public Maruti()
    {
     System.out.println("Class Maruti");
    }
    public void brand()
    {
     System.out.println("Brand: Maruti");
    }
    public void speed()
    {
     System.out.println("Max: 260Kmph");
    }
 }
 class Ertiga extends Maruti{
 
    public Ertiga()
    {
     System.out.println("Ertiga Model: 2020");
    }
    public void speed()
    {
     System.out.println("Max: 220Kmph");
    }
}


public class Multi_Level {
    public static void main(String args[])
    {
      Ertiga obj=new Ertiga();
      obj.vehicleType();
      obj.brand();
      obj.speed();
    }
    
}