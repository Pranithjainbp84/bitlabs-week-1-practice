import java.util.Arrays;
import java.util.Scanner;
 
public class Anagram {
 
    
			
    public static void Find(String S1, String S2) {
        String str1 = S1.replaceAll(" ", "");
        String str2 = S2.replaceAll(" ", "");
 
        boolean flag = false;
 
        if (str1.length() != str2.length()) {
            System.out.print("case 1 : length-->");
            System.out.println(" Nope not an Anagram");
        } else {
            char[] ch1 = str1.toLowerCase().toCharArray();//k,e,e,p
            char[] ch2 = str2.toLowerCase().toCharArray();//p,e,e,k
 
            Arrays.sort(ch1);// e e k p
            Arrays.sort(ch2);//e e k p
 
            flag = Arrays.equals(ch1, ch2);
        }
        if (flag == true) {
            System.out.println(str1 + "---" + str2 + "-->Yes Anagram");
        } else {
            System.out.print("case 2 :");
            System.out.println(str1 + "---" + str2 + "--> Not Anagram");
        }
 
    }
 public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter first :");
        String S1 = S.nextLine();
        System.out.println("Enter Second :");
        String S2 = S.nextLine();
 
        Anagram.Find(S1, S2);
    }
 
}