import java.util.*;

public class Duplicate {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println();
        System.out.print("Enter the string : ");
        String sentence = s.nextLine();
        String[] word = sentence.split(" ");
        for (int i = 0; i < word.length; i++) {
            for (int j = i + 1; j < word.length; j++) {
                if (word[i].equals(word[j])) {
                    System.out.println(word[i]);
                    word[i] = "0";
                }

            }
        }
    }
}
