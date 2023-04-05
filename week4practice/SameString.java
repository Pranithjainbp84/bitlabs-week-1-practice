public class SameString {
 
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "hello";

if (str1.equalsIgnoreCase(str2)) {
    System.out.println("The two strings are the same, ignoring their cases.");
} else {
    System.out.println("The two strings are different.");
}
		}
}