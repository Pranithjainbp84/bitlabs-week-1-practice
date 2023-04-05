import java.util.*;
public class String1{
  public static void main(String args[]){
    int acount=0,dcount=0,scount=0,spcount=0;
    Scanner s=new Scanner(System.in);
    System.out.println("Enter your Username");
    String name=s.nextLine();
    for(int i=0;i<name.length();i++){
      if(name.charAt(i)>='A' && name.charAt(i)<='Z' || name.charAt(i)>='a' && name.charAt(i)<='z'){
        acount++;
      }
      else if(name.charAt(i)>='0' && name.charAt(i)<='9'){
        dcount++;
      }
        else if(name.charAt(i)==' '){
          spcount++;
        }
      else{
        scount++;
      }
    }
    System.out.println("ALPHABETS COUNT: "+acount);
    System.out.println("DIGITS COUNT: "+dcount);
    System.out.println("SPECIAL CHARACTERS COUNT: "+scount);
    System.out.println("SPACE COUNT: "+spcount);
  }
}