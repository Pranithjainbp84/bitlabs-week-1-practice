import java.util.Scanner;
 
class evenorodd {
 
  public static void main(String args[]) {
 
   Scanner s = new Scanner(System.in);
 
   int num = 0;
    System.out.println("Enter number to check it is even or odd");
    num = s.nextInt();
    if (num % 2 == 0) {
      System.out.println(num + " is even number");
    } else {
      System.out.println(num + " is odd number");
    }
 
  }
 
}
