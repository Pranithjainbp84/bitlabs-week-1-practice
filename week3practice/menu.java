import java.util.Scanner;
public class menu {
    Scanner s=new Scanner(System.in);
    
    int arr[]=new int[100];
    int numberOfElements=0;
    
    public void insertLast() {
        System.out.println("Enter new value");
        int value=s.nextInt();
        
            arr[numberOfElements]=value;
            numberOfElements++;
        
    }
    
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
    public void insertSpecific() {
        System.out.println("Enter new value");
        int value=s.nextInt();
        System.out.println("enter index value");
        int index=s.nextInt();
        if(index<=numberOfElements) {
        for(int i=numberOfElements;i>index;i--) {
            arr[i]=arr[i-1];
        }
        arr[index]=value;
        numberOfElements++;
        }
        else {
            System.out.println("Invalid index");
        }
        
        
    }
    public void viewOptions() {
        int option=0;
        do {
        System.out.println("\n1. Insert first");
        System.out.println("2. Insert Last ");
        System.out.println("3. Insert specific");
        
        System.out.println("4. Remove first element");
        System.out.println("5. Remove last element");
        System.out.println("6. remove element from specific index");
        
        System.out.println("7. remove first occurance of search element");
        System.out.println("8. remove last occurance of search element");
        System.out.println("9. remove all occurances of search element");
        
        
        
        System.out.println("Choose your option :");
         option=s.nextInt();
        switch(option) {
        case 1:{
            insertFirst();
            display();
            break;
        }
        case 2: {
            insertLast();
            display();
            break;
        }
        case 3:{
            insertSpecific();
            display();
            break;
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