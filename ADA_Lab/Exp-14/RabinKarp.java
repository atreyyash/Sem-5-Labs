import java.util.*;
import java.io.*;

/**
 * RabinKarp
 */
public class RabinKarp {

    public  final static int d = 250;

    static void search(String fast, String txt, int q){
        int M = fast.length();
        int p = 0;
        int N = txt.length();
        int i, j;
        int t=0;
        int h = 1;

        for(i=0;i<M-1;i++){
            h = (h * d) % q;
        }

        for(i=0;i<M;i++){
            p = (d * p + fast.charAt(i)) % q;
            t = (d * t + txt.charAt(i) % q);
        }

        for(i=0;i<=N-M;i++){
            if(p==t){
                for(j=0;j<M;j++){
                    if(txt.charAt(i+j) != fast.charAt(j))
                        break;
                }
                if(j==M)
                    System.out.println("Match found at " + i);
            }
            if(i < N-M){
                t = (d * (t - txt.charAt(i)*h) + txt.charAt(i+M))%q;

                if(t<0){
                    t = (t+q);
                }
            }
        }
    }

    public static void main(String[] args){
        String txt = "";
        String fast = "";
        int q = 101;
        search(fast, txt, q);

    }
}