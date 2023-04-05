import java.util.Scanner;
public class Midvalue{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    //n values:  23 45 67 89 56      n/2 : 2
    //n values:  23 45 67 89      n/2 : 2   (n/2)-1
    
    System.out.println("Enter n value");
    int n=s.nextInt();
    int arr[]= new int[n];
   System.out.println("Enter "+n+" values");
    for(int i=0;i<n;i++) {
        arr[i]=s.nextInt();
    }
 
    if(n%2==0) {
        System.out.println(arr[(n/2)-1]+" and  "+arr[n/2]);
        
    }
    else {
        System.out.println(arr[n/2]);
    }
  
  }
}
    