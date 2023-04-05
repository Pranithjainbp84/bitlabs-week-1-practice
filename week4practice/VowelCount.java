import java.util.Scanner;

public class VowelCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine().toLowerCase(); 
        int countA = 0, countE = 0, countI = 0, countO = 0, countU = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a') {
                countA++;
            } else if (ch == 'e') {
                countE++;
            } else if (ch == 'i') {
                countI++;
            } else if (ch == 'o') {
                countO++;
            } else if (ch == 'u') {
                countU++;
            }
        }

        System.out.println("Frequency of A: " + countA);
        System.out.println("Frequency of E: " + countE);
        System.out.println("Frequency of I: " + countI);
        System.out.println("Frequency of O: " + countO);
        System.out.println("Frequency of U: " + countU);
    }
}
