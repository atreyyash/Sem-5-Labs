import java.util.*;
/**
 * String_in_LexographicOrder
 */
public class String_in_LexographicOrder{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String Students[] = new String[10];
        for (int i = 0; i < 10; i++) {
            Students[i] = s.nextLine();
        }
        Arrays.sort(Students);
        System.out.println(Arrays.toString(Students));
        s.close();
    }
}