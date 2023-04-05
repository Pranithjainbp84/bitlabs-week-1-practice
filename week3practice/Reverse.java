import java.util.Scanner;
public class Reverse
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of Array");
		int n = sc.nextInt();
		System.out.println("Enter Array Elements");
		int[] arr=new int[n];
		int[] revarr=new int[n];
		 for(int i=0;i<n;i++){
		 arr[i]=sc.nextInt();
		 }
		for(int i=0;i<n;i++){
     for(int i=n-1;i>=0;i--){
			 revarr[i]=sc.nextInt();
				System.out.println("Array in Reverseorder"+"");
			}
}
}
}
