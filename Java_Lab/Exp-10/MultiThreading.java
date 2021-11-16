import java.lang.*;
import java.io.*;
import java.util.*;

class Thread1 extends Thread{
    int a, b;
    Thread1(int x, int y){
        a = x;
        b = y;
    }

    public void run(){
        System.out.println("Sum : " + (a+b));
    }
}

class Thread2 extends Thread{
    int a, b;
    Thread2(int x, int y){
        a = x;
        b = y;
    }
    public void run(){
        System.out.println("Difference : " + (a-b));
    }
}

class Thread3 extends Thread{
    int a, b;
    Thread3(int x, int y){
        a = x;
        b = y;
    }
    public void run(){
        System.out.println("Product : " + (a*b));
    }
}

class Thread4 implements Runnable{
    int a, b;
    Thread4(int x, int y){
        a = x;
        b = y;
    }
    @Override public void run(){
        System.out.println("Quotient : " + (a/b));
    }
}

class Thread5 implements Runnable{
    int a, b;
    Thread5(int x, int y){
        a = x;
        b = y;
    }
    @Override public void run(){
        System.out.println("Remainder :" + (a%b));
    }
}

class Thread6 implements Runnable{
    int a, b;
    Thread6(int x, int y){
        a = x;
        b = y;
    }
    @Override public void run(){
        System.out.println(Math.pow(a, b) + " is " + a + " to the power of " + b);
    }
}


public class MultiThreading{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter Two numbers : ");

        int a = s.nextInt();
        int b = s.nextInt();

        Thread1 ob1 = new Thread1(a, b);
        ob1.start();
        Thread2 ob2 = new Thread2(a, b);
        ob2.start();
        Thread3 ob3 = new Thread3(a, b);
        ob3.start();
        Thread4 ob4 = new Thread4(a, b);
        Thread t1 = new Thread(ob4, "Thread4");
        t1.start();

        s.close();
    }
}
