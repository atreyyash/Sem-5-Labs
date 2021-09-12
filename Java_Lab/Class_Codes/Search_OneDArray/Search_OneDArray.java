/*create a OneDArray which will search a number and should return false if the number is not found and true if the number is found*/

import java.util.Scanner;

class Search_OneDArray{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        boolean t = false;
        System.out.println("Enter Elements of Array : ");
        for(int i=0;i<n;i++){
            arr[i] = s.nextInt();
        }
        int key = s.nextInt();
        for(int i=0;i<n;i++){
            if(arr[i]==key){
                t= true;
                break;
            }
        }
        if(t==true){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
        s.close();
    }
}