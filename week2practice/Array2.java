import java.util.Scanner;
public class Array2
{
public void removeFirstElement(int[] arr1){
		int[] newArr=new int[4];
		for(int i=1;i<newArr.length;i++){
			newArr[i]=arr1[i];
		}
for(int i=1;i<newArr.length;i++){
			System.out.println(newArr[i]);
		}
}
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int[] arr=new int[5];
for(int j=0;j<arr.length;j++){
		System.out.println("Enter number "+ (j+1));
		 arr[j]=sc.nextInt();
}
	 Array2 obj=new Array2();
	 obj.removeFirstElement(arr);
}
}