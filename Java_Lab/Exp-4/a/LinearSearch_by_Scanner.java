import java.util.Scanner;
public class LinearSearch_by_Scanner{
    public static void linear_search(int[] arr, int key){
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==key){
                System.out.println("The no is present at : "+(i+1));
                return;
            }
        }
        System.out.println("Element not present in array.");
        return;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = s.nextInt();
        }
        int key = s.nextInt();
        linear_search(arr, key);
        s.close();
    }
}