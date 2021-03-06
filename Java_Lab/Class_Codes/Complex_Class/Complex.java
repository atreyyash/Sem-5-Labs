/**
 * Complex
 */
import java.util.*;

public class Complex{
    int real, image;

    public Complex(int r, int i){
        this.real = r;
        this.image = i;
    }
    public static Complex ComplexAdd(Complex c1, Complex c2){
        Complex result = new Complex(0, 0);

        result.real = c1.real + c2.real;
        result.image = c1.image + c2.image;

        return result;
    }

    public static Complex ComplexSub(Complex s1, Complex s2){
        Complex sub = new Complex(0, 0);

        sub.real = s1.real + s2.real;
        sub.image = s1.image + s2.image;

        return sub;
    }

    public static Complex ComplexMul(Complex m1, Complex m2){
        Complex mul = new Complex(0, 0);

        mul.real = (m1.real * m2.real) - (m1.image * m2.image);
        mul.image = (m1.real * m2.image) + (m2.real * m1.image);

        return mul;
    }

    public static double ComplexMod(Complex m1){
        double mod;

        mod = Math.sqrt((m1.real*m1.real)+(m1.image*m1.image));

        return mod;
    }

    public static Complex ComplexCon(Complex c1){
        return new Complex(c1.real, -c1.image);
    }

    public void showC(){
        System.out.println(this.real + " +i" + this.image);
    }

    public static void main(String[] args){
        System.out.println("Operations on Complex Number :");

        Complex C1 = new Complex(3, 5);
        Complex C2 = new Complex(7, 1);

        Complex C3 = ComplexAdd(C1, C2);
        C3.showC();

        Complex C4 = ComplexSub(C1, C2);
        C4.showC();

        Complex C5 = ComplexMul(C1, C2);
        C5.showC();

        Complex C6 = ComplexCon(C1);
        C6.showC();

        Double C7 = ComplexMod(C1);
        System.out.println(C7);
    }
}