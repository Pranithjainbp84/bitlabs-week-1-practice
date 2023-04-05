import java.util.Scanner;
public class array1{
public static void main(String args[]){
	int i,j;
	int arr[]=new int[5];
	Scanner s=new Scanner(System.in);
	for(j=0;j<arr.length;j++){
		System.out.println("Enter your value"+(j+1));
		arr[j]=s.nextInt();
	}
	for(i=0;i<arr.length;i++){
		System.out.println(arr[i]);
	}
}
}