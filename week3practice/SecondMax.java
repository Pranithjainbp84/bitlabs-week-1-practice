import java.util.Scanner;

 

public class SecondMax {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter size: ");
    int n = s.nextInt();
    int[] arr = new int[n];
    System.out.println("Enter values: ");
    for (int i = 0; i < n; i++) {
      arr[i] = s.nextInt();
    }
		int max = 0;
    int s_max = 0;
    for (int i = 0; i < n; i++) {
      if (max < arr[i]) {
        s_max = max;
        max = arr[i];
      } else if (s_max < arr[i]) {

 

        s_max = arr[i];
      }
    }
    System.out.println("Max num is: " + max);
    System.out.println("----------");
    System.out.println("Second max num is: " + s_max);
    System.out.println("----------");
}
}