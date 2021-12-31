import java.util.Vector;
import java.util.Iterator;
import java.util.Scanner;
import java.io.*;

/**
 * Vectors
 */
public class Vectors {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int c;
        Vector<String> vector = new Vector<>();
        do {
            System.out.println("1.Add \n2.Show \n3.Get \n4.Remove \n5.RemoveAll \n6.Stop");
            System.out.println("Enter Which do you want to perform");
            c = s.nextInt();
            switch (c) {
                case 1:
                    System.out.print("Enter string only : ");
                    String element = s.next();
                    vector.add(element);
                    break;
                case 2:
                    Iterator<String> iterate = vector.iterator();
                    System.out.print("Vector: ");
                    while(iterate.hasNext()) {
                    System.out.print(iterate.next());
                    System.out.print(", ");
                    }
                    System.out.println();
                    break;
                case 3:
                    System.out.print("Enter index : ");
                    int in = s.nextInt();
                    System.out.println(vector.get(in));
                    break;
                case 4:
                    System.out.print("Enter index to be removed : ");
                    int ind = s.nextInt();
                    vector.remove(ind);
                    break;
                case 5:
                    vector.clear();
                    System.out.println("Removed All elements!.");
                    break;
                default:
                    break;
            }
        } while (c!=6);
        s.close();
    }
}