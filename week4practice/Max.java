import java.util.*;

public class MinString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println();
        System.out.print("Enter the string : ");
        String sentence = s.nextLine();
        String[] word = sentence.split(" ");
        String smallest = word[0];
        for (int i = 1; i < word.length; i++) {
            if (word[i].length() < smallest.length()) {
                smallest = word[i];
            }
        }
        System.out.println("Smallest word: " + smallest);
    }
}
