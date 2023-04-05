import java.util.Scanner;

 

public class All {
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

 

    int t = 0;
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < n; j++) {
        if (arr[i] > arr[j]) {
          t = arr[i];
          arr[i] = arr[j];
          arr[j] = t;
        }
      }
    }
    System.out.println("Min num is: " + arr[0]);
    System.out.println("----------");
    System.out.println("Second min num is: " + arr[1]);
    System.out.println("----------");

 

    int sum = 0;
    for (int i = 0; i < n; i++) {
      sum += arr[i];
    }
    double average = (double) sum / n;
    System.out.println("Total value: " + sum);
		System.out.println("----------");
    System.out.println("Average value: " + average);
    System.out.println("----------");

 

    int even_sum=0;
    int odd_sum=0;
    for(int i=0;i<n;i++){
      if(arr[i]%2==0){
        even_sum=even_sum+arr[i];
      }
      else{
        odd_sum=odd_sum+arr[i];
      }
    }
    System.out.println("the sum of even elements: "+even_sum);
    System.out.println("----------");
    System.out.println("the sum of odd elements: "+odd_sum);
    System.out.println("----------");

 

    int count_even=0;
    int count_odd=0;
    for(int i=0;i<n;i++){
      if(arr[i]%2==0){
        
        count_even++;
        
      }
      else{
        count_odd++;
      }
    }
    System.out.println("the number of even elements are: "+count_even);
    System.out.println("----------");
    
     System.out.println("the number of odd elements are: "+count_odd);
		
  }
}

