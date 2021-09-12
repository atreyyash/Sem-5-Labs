import java.io.*;

public class LinearSearch_by_CmdLineArgs{
    public static void main(String[] args){
        int n = args[0];
        int temp = 0;
        int arr[] = new int[n];
        for(int i=1;i<=n;i++){
            arr[i] = args[i];
        }
        int key = args[n+1];
        for(int i=0;i<n;i++){
            if(key == arr[i]){
                System.out.println("Element is present at "+(i+1));
                temp=1;
                break;
            }
        }
        if(temp==0){
            System.out.println("Element not present");
        }

    }
}