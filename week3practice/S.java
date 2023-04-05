import java.util.Scanner;
public class S
{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the length of the array");
    int len=s.nextInt();
    int a[]=new int[len];
    for(int i=0;i<len;i++)
    {
    System.out.println("Enter the array elements");
    a[i]=s.nextInt();
    }
   int maxicount=0,minicount=len;
    for(int i=1;i<len;i++)
      {
       maxicount=1;
        for(int j=0;j<len;j++)
          {
            if(a[i]==a[j])
            {
             maxicount++;
            }
           if(i<minicount)
            {
              minicount=i;
            }
         }
    }
    System.out.println("Difference is " +(maxicount-(minicount)));
    }
}