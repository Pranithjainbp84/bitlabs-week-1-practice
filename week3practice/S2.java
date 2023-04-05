import java.util.Scanner;
public class S2
{
public static void main(String args[])
{
int n,sumeven=0,sumodd=0,diff=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter size of array");
n=sc.nextInt();
System.out.println("Enter elements of array");
int []arr=new int[n]; 
for( int i=0;i<n;i++)  
{
arr[i]=sc.nextInt();
}
for(int i=0;i<n;i++)
  {
if(arr[i]%2==0)
{
sumeven=arr[i]+sumeven;
}
else if(arr[i]%2!=0)
{
sumodd=arr[i]+sumodd;   
}
else{
diff=sumeven-sumodd;
  }
}
System.out.println("sum of even numbers:"+sumeven );
System.out.println("sum of odd numbers:"+sumodd);
System.out.println("diff of sumeven and sumodd numbers:"+diff);
}
}
 