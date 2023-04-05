import java.util.Scanner;
 
public class S4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        boolean[] visited = new boolean[n];
        for (int m = 0; m < n; m++) {
            visited[m] = false;
        }
        int maxFrequency = Integer.MIN_VALUE;
        int highCharIndex = 0;
        int minFrequency = Integer.MAX_VALUE;
        int lowCharIndex = 0;
        for (int i = 0; i < n; i++) {
            if (visited[i] == true) {
                continue;
            }
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            if (maxFrequency < count) {
                maxFrequency = count;
                highCharIndex = i;
            }
            if (minFrequency > count) {
                minFrequency = count;
                lowCharIndex = i;
            }
        }
        System.out.println("Highest frequency number is " + arr[highCharIndex] + " and it occurs " + maxFrequency + " times.");
        System.out.println("Lowest frequency number is " + arr[lowCharIndex] + " and it occurs " + minFrequency + " times.");
        System.out.println("required difference is:"+(maxFrequency-minFrequency));
    }
}