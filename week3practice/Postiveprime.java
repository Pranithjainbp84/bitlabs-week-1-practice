import java.util.Scanner;
public class Postiveprime{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
      int input[]= {34,13,-45,23,-56,11,-47};
      
      int p[]=new int[input.length];  
      int n[]=new int[input.length];
      int prime[]=new int[input.length];
      
      int pIndex=-1,nIndex=-1,primeIndex=-1;
      int factor=0;
      for(int i=0;i<input.length;i++) {
        
          if(input[i]>0) {
              p[++pIndex]=input[i];
          }
          else {
              n[++nIndex]=input[i];
          }
          
          for(int j=1;j<=input[i]/2;j++) {
             if(input[i]%j==0) {
                 factor++;
             }
          }
          if(factor==1) {
              prime[++primeIndex]=input[i];
          }
          factor=0;
          
      }
      
      System.out.println("==========+ve values=========");
      for(int i=0;i<pIndex;i++) {
          System.out.print(p[i]+" ");
      }
      System.out.println();
      System.out.println("==========-ve values==========");
      for(int i=0;i<nIndex;i++) {
          System.out.print(n[i]+" ");
      }
      System.out.println();
      System.out.println("========Prime values========");
      for(int i=0;i<primeIndex;i++) {
          System.out.print(prime[i]+" ");
      }
      
      
  }
}