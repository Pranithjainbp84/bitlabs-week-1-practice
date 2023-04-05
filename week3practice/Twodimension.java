import java.util.Scanner;
public class Twodimension{
  public static void main(String[] args){
 
    Scanner sc=new Scanner(System.in);
   int[][] arr=new int[2][2]; //single dimentional
 
    for(int i=0;i<2;i++) {
      for(int j=0;j<2;j++){
        System.out.println("Enter element");
        arr[i][j]=sc.nextInt();
      }
    }
    
    for(int i=0;i<2;i++) {
      for(int j=0;j<2;j++){
        System.out.print(arr[i][j]+" ");
        
      }
      System.out.println();
    }
 
    
  }
}