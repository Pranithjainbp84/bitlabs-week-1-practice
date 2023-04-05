/*Write a program that takes an array of integers and returns the index of the first occurrence of a given integer in the array.*/
import java.util.Scanner;
public class S7{
public static void main(String args[]){
  Scanner s=new Scanner(System.in);
  System.out.println("enter the array size: ");
  int n=s.nextInt();
  int arr[]=new int[n];
  System.out.println("enter the array elements: ");

 

  
  
  for(int i=0;i<arr.length;i++){
    arr[i]=s.nextInt();
  }
    
  System.out.println("enter the search element: ");
  int p=s.nextInt();
  int index=-1;
  for(int i=0;i<arr.length;i++){
    if(arr[i]==p){
      index=i;
      break;
    }
  }
  if(index==-1){
    System.out.println("the element not found in array");
    
  }
  else{
    System.out.println("the occurance of element of index position is : "+index);
  }
}
    
}