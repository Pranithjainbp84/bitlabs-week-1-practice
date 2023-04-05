import java.util.Scanner;
public class PerfectNumber{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int n , sum = 0;
		System.out.println("Enter the Number");
		n =s.nextInt();
		int i = 1;
		for(i=0;i<n;i++){
				if (n%i == 0) {
                sum = sum + i;
				}
		}
		if (sum == n){
			System.out.println("The number is perfect"+n);
				}
			else {
				System.out.println("The number is not perfect"+n);
			}		
	}
}
