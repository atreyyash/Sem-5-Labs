class MyException extends Exception {
    private int detail;

    MyException(int a) {
        detail = a;
    }

    public String toString() {
        return "Custom Exception Returned by MyException[" + detail + "]";
    }
}

class ExceptionDemo {
    static void compute(int a) throws MyException {
        System.out.println("Called compute(" + a + ")");
        if (a > 10)
            throw new MyException(a);
        System.out.println("Normal exit");
    }

    public static void main(String args[]){
        try {
            compute(1);
            compute(6);
            compute(20);    //After returning 1st Custom exception it will stop and don't pass 
            compute(25);
        } catch (MyException e) {
            System.out.println("Caught " + e);
            System.out.println("This is a Custom Exception!");
            System.out.println("Yash Atrey \nCSE-A\n109");
        }
    }
}