import java.util.*;

public class Remove_Stop_Words {
    public static void main(String args[]) {
        System.out.println("Enter a paragraph : ");
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String stop[] = { "i", "me", "my", "myself", "we", "our", "ours", "ourselves", "you", "your", "yours",
                "yourself", "yourselves", "he", "him", "his", "himself", "she", "her", "hers", "herself", "it", "its",
                "itself", "they", "them", "their", "theirs", "themselves", "what", "which", "who", "whom", "this",
                "that", "these", "those", "am", "is", "are", "was", "were", "be", "been", "being", "have", "has", "had",
                "having", "do", "does", "did", "doing", "a", "an", "the", "and", "but", "if", "or", "because", "as",
                "until", "while", "of", "at", "by", "for", "with", "about", "against", "between", "into", "through",
                "during", "before", "after", "above", "below", "to", "from", "up", "down", "in", "out", "on", "off",
                "over", "under", "again", "further", "then", "once", "here", "there", "when", "where", "why", "how",
                "all", "any", "both", "each", "few", "more", "most", "other", "some", "such", "no", "nor", "not",
                "only", "own", "same", "so", "than", "too", "very", "s", "t", "can", "will", "just", "don", "should",
                "now" };
        String l = str.toLowerCase();
        String spl[] = l.split(" ", 0);
        ArrayList<String> recover = new ArrayList<>();
        for (int i = 0; i < spl.length; i++) {
            for (int j = 0; j < stop.length; j++) {
                if (spl[i].equals(stop[j]))
                    spl[i] = "0";
            }
        }
        System.out.println("\nOriginal String - " + str);
        System.out.print("New String - ");
        for (int i = 0; i < spl.length; i++) {
            if (spl[i] != "0") {
                recover.add(spl[i] + " ");
                System.out.print(spl[i] + " ");
            }
        }
        System.out.println("\nName : Yash Atrey \nCSE-A");
        // System.out.println(l);
    }
}