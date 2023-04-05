import java.util.Scanner;
public class Frequency{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int arr[]= {34,89,45,34,34,55};
    
    System.out.println("Enter search element");
    int search=s.nextInt();
    int count=0;
    
    for(int i=0;i<arr.length;i++) {
        if(search==arr[i]) {
            count++;
            
        }
    }
    if(count==0) {
        System.out.println(search+" is not found");
    }
    else {
        System.out.println(search+" frequency is: "+count);
    }
    
  }
}