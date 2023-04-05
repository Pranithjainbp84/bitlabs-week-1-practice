 import java.util.Scanner;
public class Array3
{
public void removeFirstElement(int[] arr1){
 int j=0; // 0 1 2 3 4
 int[] newArr=new int[4]; //arr1 10 20 30 40 50
 // 4 4<4 4
 for( j=1;j<newArr.length;j++){ //new 20 30 40 50
 //3-1 // arr[3] // 0 1 2 3
 newArr[(j-1)]=arr1[j];
 }
  newArr[(j-1)]=arr1[j];
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
 Array3 obj=new Array3();
 obj.removeFirstElement(arr);
}
}  