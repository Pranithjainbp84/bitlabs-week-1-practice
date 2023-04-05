import java.util.Scanner;
public class S5
  {
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter the array length");
      int len=s.nextInt();
      int a[]=new int[len];
      for(int i=0;i<len;i++)
        {
          System.out.println("Enter the number"+(i+1));
          a[i]=s.nextInt();
        }
      int newa[]=new int[len];
      for(int i=0;i<len;i++)
        {
          newa[i]=a[i];
       }
      System.out.println("Array after copying to new array is : ");
      for(int i=0;i<len;i++)
        {
      System.out.print(+newa[i] +" ");
    }
    }
     
  }