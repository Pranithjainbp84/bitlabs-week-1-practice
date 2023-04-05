import java.util.Scanner;

class MinValue {
 
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
 
   System.out.println("How many values do you want to enter");
    int n = s.nextInt(); // 5 10
     //int min=0;
    System.out.println("Enter " + n + " values"); // 45,89,55,90,33
     int min = s.nextInt(); // 45
    for (int i = 1; i <= n; i++) {
      int num =  s.nextInt();
      if(min > num){       //90<33
          min=num;        //max=90
      }
    }
    System.out.println("Min value: "+ min);
  }
 
}