 



import java.util.Scanner;
public class numberofodd{
  public static void main(String args[]){

 

    int n=0, count=0;
     Scanner sc=new Scanner(System.in);
    System.out.println("Enter the value of n");
    n=sc.nextInt();
    for(int i=1;i<=n;i++){
      if(i%2!=0){
        count++;
      }
    }
    System.out.println(count);
  }
}