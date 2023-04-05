import java.util.Scanner;
 
public class Bank {
    Scanner s=new Scanner(System.in);
    double acbal=10000;
   public void deposite() {
    System.out.println("Enter deposite amount");
    int amount = s.nextInt();
    if (amount % 100 == 0)
    {
      if (amount <= 50000)
      {
        acbal = acbal + amount;
        System.out.println("available bal: " + acbal);
      }
      else 
      {
        System.out.println("not allowed more than 50000");
      }
    } 
    else 
    {
      System.out.println("invalid amount");
    }
     viewOptions();
  }
  public void withdraw()
  {
    System.out.println("Enter withdraw amount");
      int amount=s.nextInt();
      if(amount%100 == 0){
        if(amount<=(acbal-500)){
          if(amount<=20000){
            System.out.println("Withdraw amount is "+amount);
            acbal=acbal-amount;
            System.out.println("available bal : "+acbal);
          }
          else{
            System.out.println("Please enter amount less than 20000");
          }
         
          }
        else{
          System.out.println("less funds");
        }
     
     
      }else{
        System.out.println("Enter multiples of 100's");
      }
      viewOptions();
    }
    
    public void viewOptions() {
        System.out.println("======Welcome to ABC Bank========");
        System.out.println("1. Deposite");
        System.out.println("2. Withdraw");
        System.out.println("3. Bal Enquiry");
        System.out.println("0. EXIT");
        System.out.println("Choose your option");
        int option=s.nextInt();
        switch(option) {
        case 1:{
            deposite();
            break;
        }
        case 2:{
            withdraw();
            break;
        }
       case 3:{
            //enquiry();
            //break;
       }
       case 0:{
          System.out.println("Thank you");
          break;
      
        }
       default:
       {
          System.out.println("Invalid option");
       }
 
      }
        
    }
    public void validate() {
        
        System.out.println("Enter pin");
        int pin=s.nextInt();
        if(pin==1234)
        {
            viewOptions();
        }
        else 
        {
        for(int i=0;i<2;i++)
          {
            System.out.println("Enter pin");
            int p=s.nextInt();
            if(p==1234) 
            {
              viewOptions();
            }
          }
          System.out.println("Invalid pin number, please try again");
        }
    }
    public static void main(String[] args) {
        Bank obj=new Bank();
         obj.validate();
 
    }
 
}
