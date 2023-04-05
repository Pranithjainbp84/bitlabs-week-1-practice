import java.util.Scanner;
public class EvenorOddArray{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
      int input[]= {34,89,45,23,56,90,47};
      int e=-1,o=-1;
      int evenArr[]=new int[input.length];  //7     34-0 56-1 90-2
      int oddArr[]=new int[input.length];   //7      89-0 45-1 23-2 47-3 
      
      for(int i=0;i<input.length;i++) {
          if(input[i]%2==0) {
              evenArr[++e]=input[i];    
          }
          else {
            oddArr[++o]=input[i];  
            
          }
      }
      //printing even values
      System.out.print("Even values: ");
      for(int i=0;i<e;i++) {
          System.out.print(evenArr[i]+" ");
      }
      System.out.println();
      //printing odd values
      System.out.print("Odd values: ");      
      for(int i=0;i<o;i++) {
          System.out.print(oddArr[i]+" ");
      }
      
  }
}