import java.util.Scanner;
public class Bubble_Sort{
    public static void bubble_sort(int[] arr){
        int n=arr.length;
        boolean swapped = false;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(swapped==false){
                break;
            }
        }
    }
        public static void main(String[] args) {
            System.out.println("Number of elements in array :");
            Scanner s = new Scanner(System.in);
            int n = s.nextInt();
            int arr[] = new int[n];
            System.out.println("Enter elements of array : ");
            for(int i=0;i<n;i++)
            {
                arr[i] = s.nextInt();
            }
            bubble_sort(arr);
            System.out.println("Sorted Array with Bubble Sort : ");
            for(int i=0;i<n;i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println("\nYash Atrey(109) \nCSE-A \nDate: 27/08/2021");
            s.close();
        }
    }

