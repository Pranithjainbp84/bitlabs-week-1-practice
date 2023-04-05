import java.util.*;
public class String2{
  public static void main(String args[]){
    int ucount=0,lcount=0;
    Scanner s=new Scanner(System.in);
    System.out.println("Enter your Username");
    String name=s.next();
    for(int i=0;i<name.length();i++){
      if(name.charAt(i)>='A' && name.charAt(i)<='Z'){
        ucount++;
      }
      else if(name.charAt(i)>='a' && name.charAt(i)<='z'){
        lcount++;
      }
    }
    System.out.println("UPPERCASE COUNT: "+ucount);
    System.out.println("LOWER CASE COUNT: "+lcount);
  }
}