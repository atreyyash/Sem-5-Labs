import java.io.*;

public class ForEach3{
    public static void main(String[] args) {
        int sum = 0;
        //int a;
        int nums[][] = new int[3][5];
        String s = "Hello";
        System.out.println("Lenght of s is "+s.length());
        int a1[] = {1,2,3,4,5,6,7,-100};
        System.out.println("Length of a1 is "+a1.length);
        for(int x : a1){
            System.out.print(x + " ");
        }

        for(int x[] : nums){
            for(int y : x){
                System.out.print(y + " ");
                sum += y;
                //nums[i][j] = (i+1) * (j+1);
            }
            System.out.println();
        }
    }
}
