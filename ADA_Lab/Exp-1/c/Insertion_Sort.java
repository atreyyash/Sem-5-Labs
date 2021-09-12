import java.util.Scanner;
public class Insertion_Sort{
    public static void insertion_sort(int[] arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            int j = i-1;
            int temp = arr[i];
            while(j>=0 && arr[j]>temp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
    }
    public static void main(String[] args){
        System.out.println("Enter no. of elements of array : ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements of array : ");
        for(int i=0;i<n;i++){
            arr[i] = s.nextInt();
        }
        insertion_sort(arr);
        System.out.println("Array Sorted by Insertion Sort : ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n\nYash Atrey(109) \nCSE-A \nDate: 27/08/2021");
        s.close();
    }
}
