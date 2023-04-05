import java.util.Scanner;
public class Primenumber
{
public static void main(String args[])
	{
	 Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();
        int a[] = new int[n+1];
        System.out.println("Enter all the elements:");
        for(int i = 0; i < n; i++){
					 array[i] = in.nextInt();
				}
		for(int i=0; i<array.length; i++){
                boolean isPrime = true;
                for (int j=2; j<i; j++){
                    if(i%j==0){
                        isPrime = false;
                        break;
										}
								}
			 if(isPrime)
		System.out.println("The prime number is:" + i);
	}
}
}