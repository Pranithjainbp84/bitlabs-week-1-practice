import java.util.Scanner;
 
class Secondmin {
 
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
 
    System.out.println("How many values do you want to enter");
    int n = s.nextInt(); // 5 10
    System.out.println("Enter " + n + " values"); // 45,89,35,90,33
    int min = s.nextInt(); // 45
    int smin = 0;
    for (int i = 1; i < n; i++) {
      int num = s.nextInt(); //
      if (min > num) { // 89<90
        smin = min;
        min = num;
      } else if (smin > num) {
        smin = num;
      }
    }
    System.out.println("Min value: " + min); // max= 90 smax=89
    System.out.println("second Min value: " + smin); // max= 90 smax=8
 
  }
 
}