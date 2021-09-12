import java.io.*;

public class LinearSearch_by_BuffReader{
    public static void linear_search(int[] arr, int key){
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(arr[i] == key){
                System.out.println("Elements found at : "+(i+1));
                return;
            }
        }
        System.out.println("Element not found in array.");
        return;
    }

    public static void main(String[] args)throws IOException{
        BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(s.readLine());
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(s.readLine());
        }
        int key = Integer.parseInt(s.readLine());
        linear_search(arr, key);
        s.close();
    }
}