//frequency of each element in an array
import java.util.Scanner;
public class S3{
   public static void main(String[] args) {
   Scanner s = new Scanner(System.in);
    System.out.print("enter number of values :");
    int n = s.nextInt();
    int[] arr = new int[n];
    System.out.println("enter values:");
    for (int i = 0; i < n; i++) {
      arr[i] = s.nextInt();
    }
     int[] freq = new int[arr.length];

  for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    freq[j] = -1; 
                }
            }
            if (freq[i] != -1) {
                freq[i] = count;
            }
        }
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] != -1) {
                System.out.println("number " + arr[i] + " occurs " + freq[i] + " times");
            }
        }
    }
}