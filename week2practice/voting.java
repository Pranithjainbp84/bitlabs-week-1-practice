import java.util.Scanner;
 
class voting {
 
  public static void main(String args[]) {
 
   Scanner s = new Scanner(System.in);
 
   int age = 0;
    System.out.println("Enter the age of a he/she to check eligability");
    age = s.nextInt();
    if (age >=18) {
      System.out.println(age + " is eligable for voting");
    } else {
      System.out.println(age + " is not eligable for voting");
    }
 
  }
 
}
