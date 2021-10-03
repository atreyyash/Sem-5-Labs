/**
 * BinarySearch
 */
import java.util.*;

public class BinarySearch{
    public static void binary_search(int[] arr, int x){
        int low = 0;
        int high = arr.length-1;
        while(low<=high){
            int mid = (low+high) / 2;
            if(arr[mid] == x){
                System.out.println("Array found at : "+(mid+1));
                return;
            }
            else if(arr[mid]> x){
                high = mid - 1;
            }
            else if(arr[mid]< x){
                low = mid + 1;
            }
            else{
                System.out.println("Element not found");
                return;
            }
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = s.nextInt();
        }
        int x = s.nextInt();
        binary_search(arr, x);
        s.close();
    }
}