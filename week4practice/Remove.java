import java.util.Scanner;

public class Remove {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        
        System.out.print("Enter a character to remove: ");
        char ch = input.next().charAt(0);
        
        String result = removeChar(str, ch);
        
        System.out.println("Result: " + result);
    }
    
    public static String removeChar(String str, char ch) {
        String result = "";
        
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) != ch) {
                result += str.charAt(i);
            }
        }
        
        return result;
    }
}