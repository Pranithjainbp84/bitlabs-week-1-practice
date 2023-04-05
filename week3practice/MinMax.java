import java.util.Scanner;
public class MinMax
{
public static void main(String[]args)
  {
   Scanner sc=new Scanner(System.in);
    int [] arr=new int[5];
     System.out.println("Enter Numbers");
     for(int i=0;i<arr.length;i++)
      {
        arr[i]=sc.nextInt();
      }
       int max=arr[1];
          for(int i=0;i<5;i++)
         {
             if(max<arr[i])
            {
               max=arr[i];
            }
          }
           System.out.println("max is :" +max);
            int min=arr[1];
             for(int i=0;i<5;i++)
         {
           if(min>arr[i])
          {
           min=arr[i];
          }
  }
    System.out.println("min is :" +min);
}
}