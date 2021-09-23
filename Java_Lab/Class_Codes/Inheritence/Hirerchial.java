class A{
    int a;
    A(){
        System.out.println("A");
    }
    A(int a){
        this.a = a;
    }
    int getA(){
        return a;
    }
}

class B1 extends A
{
    B1(){
        super();
        System.out.println("B1");
    }
}

class B2 extends A{
    int b;
    B2(){
        super(3);
        b = -5;
        System.out.println("B2");
    }
    void add(){
        b = b * super.a;
        System.out.println("B2"+" value of a & b "+a + " "+ b);
        b = b * super.getA();
        System.out.println("B2"+" value of a & b "+a+" "+b);
    }
}

class Hirerchial{
    public static void main(String[] args) {
        A oba = new A();
        B1 ob1 = new B1();
        B2 ob2 = new B2();
        ob2.add();
    }
}