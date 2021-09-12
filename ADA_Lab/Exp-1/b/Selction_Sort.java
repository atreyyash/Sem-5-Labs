import java.util.Scanner;
public class Selction_Sort{
    public static void selection_sort(int[] arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            int min =i;
            for(int j=0;j<n;j++){
                if(arr[min] > arr[j]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;

        }
    }

    public static void main(String[] args){
        System.out.println("Enter the no. of elements in array : ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int an[] = new int[n];
        System.out.println("Enter elements of array : ");
        for(int i=0;i<n;i++){
            an[i] = s.nextInt();
        }
        selection_sort(an);
        System.out.println("Sorted Array with Selection Sort : ");
        for(int i=0;i<n;i++){
            System.out.print(an[i] + " ");
        }
        System.out.println("\n\nYash Atrey(109) \nCSE-A \nDate: 27/08/2021");
        s.close();

    }
}
