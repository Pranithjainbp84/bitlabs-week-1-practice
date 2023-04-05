//Wap to find all the duplicate elements in an array 
import java.util.Scanner;
public class S1 {

 
  public static void main(String[] args)

 
  {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the size of the array: ");
    int n=s.nextInt();
    int arr[]=new int[n];
    System.out.println("enter the elements : ");
    
   for(int i=0;i<arr.length;i++)
    {
      arr[i]=s.nextInt();
    }
    for(int i=0;i<n;i++)
    {
      for (int j=i+1;j<n;j++) 
      {
        if(arr[i] == arr[j]) 
        {
          System.out.println("Duplicate elements are");
          System.out.println(arr[j]);
        }
      }
    }

 

    
  }
  
}