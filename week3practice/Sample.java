import java.util.Scanner;
public class Sample {
    Scanner s=new Scanner(System.in);
    
    int arr[]=new int[100];
    int numberOfElements=0;
    
    public void insertFirst() {
        System.out.println("Enter new value");
        int value=s.nextInt();
        if(numberOfElements==0) {
            arr[0]=value;
            numberOfElements++;
        }
        else {                 
            for(int i=numberOfElements;i>0;i--) {
                arr[i]=arr[i-1];
            }
            arr[0]=value;
            numberOfElements++;
        }
        
    }
    
    public void display() {
        for(int i=0;i<numberOfElements;i++) {
            System.out.print(arr[i]+"  ");
        }
    }
    public void viewOptions() {
        int option=0;
        do {
        System.out.println("\n1. Insert first");
        System.out.println("Choose your option :");
         option=s.nextInt();
        switch(option) {
        case 1:{
            insertFirst();
            display();
            break;
        }
        case 2: {
            
        }
        default:{
            System.out.println("Invalid option");
        }
        }
        }
        while(option!=0);
        
    }
  public static void main(String args[]){
   
      Sample obj=new Sample();
      obj.viewOptions();
      
  }
}