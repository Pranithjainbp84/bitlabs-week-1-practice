import java.util.Scanner;
 
class findbig {
 
  public static void main(String args[]) {
 
   Scanner s = new Scanner(System.in);
 
   int num1 = 0 , num2 =0 ,num3 = 0;
    System.out.println("Enter num1 ,num2, num3 values");
    num1 = s.nextInt();
    num2 = s.nextInt();
    num3 = s.nextInt();
    if (num1 > num2 && num1 > num3 ) {
      System.out.println(num1 + " is big");
    } 
    else if (num2 > num3){
      System.out.println(num2 + " is big");
    }
    else {
      System.out.println(num3 + " is big");
    }
 
  }
 
}