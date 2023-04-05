import java.util.Scanner;
public class Array4
{
public void removeFirstElement(int[] arr1,int pos){
	 int j=0; // 0 1 2 3 4
	 int[] newArr=new int[4]; //arr1 10 20 30 40 50
				// 4 4<4 4
		for( j=0;j<newArr.length-1;j++){ //new 10 20 40 50
																			// 0 1 2 3
			if(j>=pos){
					newArr[j]=arr1[j+1];
			}
			else{
			newArr[j]=arr1[j];
			}
		}
		newArr[j]=arr1[j+1];
		for(int i=0;i<newArr.length;i++){
			System.out.println(newArr[i]);
		}
}public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[5];
	 for(int j=0;j<arr.length;j++){
		 System.out.println("Enter number "+ (j+1));
		 arr[j]=sc.nextInt();
		}
		System.out.println("Enter index postion to remove element");
		int pos=sc.nextInt();
		Array4 obj=new Array4();
	 obj.removeFirstElement(arr,pos);
}
}