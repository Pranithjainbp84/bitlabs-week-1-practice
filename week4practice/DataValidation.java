class DataValidation{
    public static void main(String args[]) {
        
 
       String name="Abdul";  // 5-15
       String email="adbul@gmail.com";
       String password="Adbul@123";
       int ucount=0,lcount=0,digits=0,scount=0;
       String mobile="8376482374";
       if(name.length()>=5 && name.length()<=15) {
           if(email.contains(".") && email.contains("@") && email.endsWith("com") ) {
               
               for(int i=0;i<password.length();i++) {
                   
                   if(password.charAt(i)>='A' && password.charAt(i)<='Z') {
                       ucount++;
                   }
                   else if(password.charAt(i)>='a' && password.charAt(i)<='z') {
                       lcount++;
                   }
                   else if(password.charAt(i)>='0' && password.charAt(i)<='9') {
                       digits++;
                   }
                   else {
                       scount++;
                   }
                   
               
               }
               if(ucount>0 && lcount>0 && digits>0 && scount>0) {
                   
                   if(mobile.length()==10) {
                      System.out.println("Done"); 
                   }
                   else {
                       System.out.println("Mobile must contains 10 digits only");
                   }
               }
               else {
                   System.out.println("Invalid password");
               }
               
           }
           else {
               System.out.println("please enter valid mail id ");
           }
           
       }
       else {
           System.out.println("Full name should contains 5-15 characters");
       }
        
        
        
        
 
        
        
        
        
    }
}