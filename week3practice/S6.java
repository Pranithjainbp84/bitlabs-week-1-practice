import java.util.Scanner;

public class S6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int length = scanner.nextInt();
        int[] arr = new int[length];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < length; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.print("Enter the integer to find: ");
        int num = scanner.nextInt();
        int index = findIndex(arr, num);
        if (index == -1) {
            System.out.println("The integer is not present in the array.");
        } else {
            System.out.println("The integer is present at index " + index);
        }
    }

    public static int findIndex(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return i;
            }
        }
        return -1;
    }
}
