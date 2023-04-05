import java.util.Scanner;
class EvenorOdd{
  
    public static void main(String args[]) {
   
        Scanner s=new Scanner(System.in);
        System.out.println("How many values do you want to enter");
         int n=s.nextInt();  
        int ecount=0,ocount=0;
        int arr[]=new int[n];
        System.out.println("Enter "+n+" values");
        for(int i=0;i<n;i++) {
            arr[i]=s.nextInt();  
					   if(arr[i]%2==0) {
                ecount++;
            }
            else {
                ocount++;
            }
        }
        System.out.println("Number of even elements: "+ecount);
        System.out.println("Number of odd elements: "+ocount);
        
        
    }
    
}
