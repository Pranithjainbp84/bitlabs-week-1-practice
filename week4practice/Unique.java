import java.util.*;

public class Unique {
	public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			System.out.println();
			System.out.print("Enter the string : ");
			String Sentence = s.nextLine();
			String[] word = Sentence.split(" ");
			for (int i = 0; i < word.length; i++) {
					for (int j = i + 1; j < word.length; j++) {
							if (word[i].equals(word[j])) {
									word[j] = "0";
							}
					}
			}
			for (int i = 0; i < word.length; i++) {
					if (word[i] != "0") {
							System.out.println("Unique word : " + word[i]);
					}

			}
	}
}