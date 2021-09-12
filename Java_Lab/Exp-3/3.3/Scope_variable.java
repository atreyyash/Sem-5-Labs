
public class Scope_variable{
    public static void main(String[] args) {
        int local1;
        local1 = 1;
        System.out.println(local1);

        if(true){
            int local2;
            local2 = 2;
            System.out.println(local2 + " is the value of Local2 and it cannot be accessed outside if-block.");
        }

        for(int local3=0;local3<10;local3++){
            System.out.print(local3+"  ");
        }
        System.out.println("\nLocal3 is not defined outside for-loop.");

        int local4 = 10;
        System.out.println("Variable local4 is defined after for-loop and cannot be accessed before it."+local4);
    }
}