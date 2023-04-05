import java.util.*;

public class MaxStringtst {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println();
        System.out.print("Enter the string : ");
        String sentence = s.nextLine();
        String[] word = sentence.split(" ");
        int max = 0, i = 0;
        String longestword = "";
        for (i = 0; i < word.length; i++) {
            if (max < word[i].length()) {
                max = word[i].length();
                longestword = word[i];
            }

        }
        System.out.println("longest word is : " + longestword + "\nIts length is : " + max);
    }
}
