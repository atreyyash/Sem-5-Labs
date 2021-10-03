import java.util.*;

public class LinearSearch{
    public static int linear_search(int[] arr, int idx, int x){
        if(idx == arr.length){
            return -1;
        }
        if(arr[idx] == x){
            return idx;
        }
        int data = linear_search(arr, idx+1, x);
        return data;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = s.nextInt();
        }
        int x = s.nextInt();
        System.out.println(linear_search(arr, 0, x));
        s.close();
    }
}