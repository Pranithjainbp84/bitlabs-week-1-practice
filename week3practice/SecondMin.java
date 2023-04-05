import java.util.Scanner;

 

public class SecondMin {
   public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int arr[]= {34,89,45,90,12,55};
    int min=arr[0];
    int smin=0;
    for(int i=1;i<arr.length;i++) {
        if(min>arr[i]) {
            smin=min;
            min=arr[i];
        }
        else if(smin>arr[i]) {
            smin=arr[i];
        }
    }
    
   System.out.println("min value: "+min);
    System.out.println("second min value: "+smin);
    
  }
}