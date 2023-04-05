//Write a program that takes an array of integers and finds the sum of all the numbers that are divisible by 3 or 5.
import java.util.Scanner;
public class Sample1
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Size of Array");
		int num= s.nextInt();
		int sum =0;
		System.out.println("Enter the Elements of Array");
		int arr[]=new int[num];
		for(int i=0;i<num;i++){
			arr[i]= s.nextInt();
		}
		for(int i=0;i<num;i++){
		if(num % 3 == 0 || num % 5 == 0){
			sum += num;
		}
	}
			System.out.println("the sum of numbers that are divisable by 3 or 5 is " +sum);
		}
	}
	
