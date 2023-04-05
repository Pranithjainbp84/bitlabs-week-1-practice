import java.util.Scanner;

public class Palindrome{

	public static void main(String[] args){
		Scanner S = new Scanner(System.in);
			System.out.println("Enter the String");
			String input = S.nextLine();
		   if (isPalindrome(input)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }

    public static boolean isPalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
		
	}
}