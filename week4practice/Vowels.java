 import java.util.*;

public class Vowels {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println();
        System.out.print("Enter a string : ");
        String sentence = s.nextLine();
        String[] word = sentence.split(" ");
        for (int i = 0; i < word.length; i++) {
            int vc = 0;
            for (int j = 0; j < word[i].length(); j++) {
                char ch = Character.toLowerCase(word[i].charAt(j));
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vc++;
                }
            }
            System.out.println("Number of vowels in " + word[i] + ": " + vc);
        }
    }
}
