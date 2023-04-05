public class ReverseWords
{
    public static void main(String[] args) {
        //Hi Hello How are you ---Input 
        //iH olleH woH era uoy ---output
        //arrays,controll statements, loops, datatypes
        
        //hello -->olleh  1234--->4321
                 // 01234   //indexposition
        String str="hello"; //charAt(1);    
               //   12345  //length
               // 
               
        String rev="";
               
           //    i=5-1            0>=0    0
         for(int i=str.length()-1; i>=0; i--){
                                      // 0
            // System.out.print(str.charAt(i));  //olleh
            rev=rev+str.charAt(i);
         }
        
      System.out.println(rev);    
    }
}