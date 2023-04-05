public class shoppingbills{
  public static void main(String args[]){

 

  int basic_salary=50000,bill1=2000,bill2=3000,bill3=4000,total_bill=0 ,total_amount=0;
    total_bill=bill1+bill2+bill3;
    total_amount=basic_salary*total_bill/100;
    System.out.println("Total Shopping amount"+ total_bill );
     System.out.println("Total amount spent for shopping"+  total_amount );
    }
}