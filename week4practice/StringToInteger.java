import java.util.Scanner;

public class StringToInteger {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number as string: ");
        String input = s.nextLine();

        try {
            int number = Integer.parseInt(input);
            System.out.println("The integer value is: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter a valid number as string.");
        }
    }
}