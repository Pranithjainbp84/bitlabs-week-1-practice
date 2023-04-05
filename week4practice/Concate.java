import java.util.Scanner;
 
public class Concate {
 
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        String str1 = S.nextLine();
        String str2 = S.nextLine();
        String str3=str1+str2;
        System.out.println(str3);
    }
 
}
