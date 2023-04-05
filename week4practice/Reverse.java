import java.util.Scanner;
 
public class Reverse {
 
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        String str = S.nextLine();
        String Str1 = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            Str1 = Str1 + str.charAt(i);
        }
        System.out.println(Str1);
 
    }
 
}