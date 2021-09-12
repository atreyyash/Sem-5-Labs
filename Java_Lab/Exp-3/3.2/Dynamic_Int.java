public class Dynamic_Int {
    public static void main(String[] args) {
        double a=3.0, b=4.0f;
        
        //value of c dynammically 
        double c = Math.sqrt(a*a+b*b);
        double d = c*a;
        System.out.println("Hypotonuse is " + c);
        System.out.println("value of d is "+d);

    }
}
