import java.util.Scanner;

public class StringMatching {
    public static void search(String txt, String pat) {
        int M = pat.length();
        int N = txt.length();

        /* A loop to slide pat one by one */
        for (int i = 0; i <= N - M; i++) {

            int j;

            /*
             * For current index i, check for pattern
             * match
             */
            for (j = 0; j < M; j++)
                if (txt.charAt(i + j) != pat.charAt(j))
                    break;

            if (j == M) // if pat[0...M-1] = txt[i, i+1, ...i+M-1]
                System.out.println("Pattern found at index " + i);
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter full String");
        String txt = scn.nextLine();
        System.out.println("Enter pattern to search");
        String pat = scn.nextLine();
        search(txt, pat);
        System.out.println("Yash Atrey CSE-A, 109");
        scn.close();
    }
}