import java.util.Scanner;
public class SumEvenOdd{
  public static void main(String[] args){
    int sum=0,sum1=0;
    Scanner s=new Scanner(System.in);
    System.out.println("How many values do you want to enter");
    int n=s.nextInt();
    System.out.println("Enter you array values");
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=s.nextInt();
    }
    for(int i=0;i<n;i++){
      if(arr[i]%2==0){
        sum=arr[i]+sum;
      }
      else if(arr[i]%2!=0){
        sum1=arr[i]+sum1;
        
      }
    }
     System.out.println("sumof Even numbers: "+sum);
     System.out.println("sum of Odd numbers: "+sum1);

	}

  }