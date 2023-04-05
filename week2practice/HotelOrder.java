  import java.util.Scanner;

public class HotelOrder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Display breakfast menu
        System.out.println("Welcome to our hotel breakfast menu!");
        System.out.println("1. Idli - Rs. 50");
        System.out.println("2. Dosa - Rs. 70");
        System.out.println("3. Upma - Rs. 60");
        System.out.println("4. Poha - Rs. 40");

        // Get order details from customer
        System.out.println("Enter the item number you want to order:");
        int itemNumber = input.nextInt();

        System.out.println("Enter the quantity:");
        int quantity = input.nextInt();

        System.out.println("Enter the GST rate (%):");
        double gstRate = input.nextDouble();

        // Calculate total cost including GST
        double itemCost = 0;
        switch (itemNumber) {
            case 1:
                itemCost = 50;
                break;
            case 2:
                itemCost = 70;
                break;
            case 3:
                itemCost = 60;
                break;
            case 4:
                itemCost = 40;
                break;
            default:
                System.out.println("Invalid item number!");
                System.exit(0);
        }
        double totalCost = itemCost * quantity;
        double cgst = (totalCost * gstRate) / 200;
        double igst = (totalCost * gstRate) / 100;

        // Display order details and total cost
        System.out.println("Order details:");
        System.out.println("Item: " + itemNumber);
        System.out.println("Quantity: " + quantity);
        System.out.println("GST rate: " + gstRate + "%");
        System.out.println("CGST: Rs. " + cgst);
        System.out.println("IGST: Rs. " + igst);
        System.out.println("Total cost: Rs. " + (totalCost + cgst + igst));
    }
}