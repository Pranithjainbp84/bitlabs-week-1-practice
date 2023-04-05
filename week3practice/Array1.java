import java.util.Scanner;
public class Array1
{
 public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
	  int[] arr=new int[5];
	 for(int i=0;i<arr.length;i++){
		 System.out.println("Enter number" +(i+1));
		 arr[i]=sc.nextInt();
	 }
 int[] newArr=new int[4]; 
 for(int i=1;i<=newArr.length;i++){
    newArr[i-1]=arr[i];
	 }
		 for(int i=0;i<newArr.length;i++){
 System.out.println(newArr[i]);
 }
 }
}
