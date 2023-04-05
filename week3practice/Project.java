import java.util.*;

public class Project {
    static Scanner s = new Scanner(System.in);

    public void remfrstelmnt(int[] arr, int n) {
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = arr[i];
        }
        for (int i = 1; i < n; i++) {
            System.out.println(arr1[i]);
        }

    }

    public void remlastelmnt(int[] arr, int n) {
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = arr[i];
        }
        for (int i = 0; i < n - 1; i++) {
            System.out.println(arr1[i]);
        }

    }

    public void remspecelmnt(int[] arr, int n) {
        System.out.println("Enter the position of element which you want to remove");
        int position = s.nextInt();
        int i = 0;
        for (i = position; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        for (i = 0; i < n - 1; i++) {
            System.out.println(arr[i]);
        }

    }

    public void insfrstind(int[] arr, int n) {
        System.out.print("Enter the number you want to add at the 0 position : ");
        int zero = s.nextInt();
        int[] arr1 = new int[n + 1];
        for (int i = 1; i < n + 1; i++) {
            arr1[i] = arr[i - 1];
        }
        arr1[0] = zero;
        for (int i = 0; i < n + 1; i++) {
            System.out.println(arr1[i]);
        }
    }

    public void inslastind(int[] arr, int n) {
        System.out.print("Enter the number you want to add at the last position : ");
        int last = s.nextInt();
        int[] arr1 = new int[n + 1];
        for (int i = 0; i < n; i++) {
            arr1[i] = arr[i];
        }
        arr1[n] = last;
        for (int i = 0; i < n + 1; i++) {
            System.out.println(arr1[i]);
        }
    }

    public void insspeceind(int[] arr, int n) {
        System.out.print("Enter the number you want to add at the specific position : ");
        int num = s.nextInt();
        System.out.print("Enter the position where you want to insert the element : ");
        int position = s.nextInt();
        int[] arr1 = new int[n + 1];
        for (int i = 0; i < n; i++) {
            arr1[i] = arr[i];
        }
        arr1[position] = num;
        for (int i = position + 1; i < n + 1; i++) {
            arr1[i] = arr[i - 1];
        }
        for (int i = 0; i < n + 1; i++) {
            System.out.print(arr1[i] + " ");
        }
    }

    public void remfrstocc(int[] arr, int n) {
        System.out.print("Enter the search element : ");
        int search = s.nextInt();
        for (int i = 0; i < n; i++) {
            if (arr[i] == search) {
                arr[i] = 0;
                break;
            }

        }
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == 0) {
                arr[i] = arr[i + 1];
                arr[i + 1] = 0;
            }
        }
        for (int i = 0; i < n - 1; i++) {
            System.out.println(arr[i]);
        }
    }

    public void remlastocc(int[] arr, int n) {
        System.out.print("Enter the search element : ");
        int search = s.nextInt();
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] == search) {
                arr[i] = 0;
                break;
            }
        }
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == 0) {
                arr[i] = arr[i + 1];
                arr[i + 1] = 0;
            }
        }
        for (int i = 0; i < n - 1; i++) {
            System.out.println(arr[i]);
        }

    }

    public void remspecificocc(int[] arr, int n) {
        System.out.print("Enter the search element : ");
        int search = s.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == search) {
                arr[i] = 0;
                count++;
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                System.out.println(arr[i]);
            }

        }

    }

    public void menu(int[] arr, int n) {
        System.out.println("=======================================================================");
        System.out.println("1. Remove first element");
        System.out.println("2. Remove last element");
        System.out.println("3. Remove specific element");
        System.out.println("4. Insert an element at first position");
        System.out.println("5. Insert an element at last position");
        System.out.println("6. Insert an element at specific position");
        System.out.println("7. Remove first occurance of search element");
        System.out.println("8. Remove last occurance of search element");
        System.out.println("9. Remove specific occurance of search element");
        System.out.println("=======================================================================");
        int option = 0;
        option = s.nextInt();
        System.out.println("=======================================================================");
        switch (option) {
            case 1:
                remfrstelmnt(arr, n);
                break;
            case 2:
                remlastelmnt(arr, n);
                break;
            case 3:
                remspecelmnt(arr, n);
                break;
            case 4:
                insfrstind(arr, n);
                break;
            case 5:
                inslastind(arr, n);
                break;
            case 6:
                insspeceind(arr, n);
                break;
            case 7:
                remfrstocc(arr, n);
                break;
            case 8:
                remlastocc(arr, n);
                break;
            case 9:
                remspecificocc(arr, n);
                break;
            default:
                System.out.println("Please Select a valid Option");
                break;
        }
    }

    public static void main(String[] args) {
        System.out.println();
        System.out.print("Enter the number of values you want to store in array : ");
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the " + (i + 1) + " value : ");
            arr[i] = s.nextInt();
        }
        Project obj = new Project();
        obj.menu(arr, n);
    }
}