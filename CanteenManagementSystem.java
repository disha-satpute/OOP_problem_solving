import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Canteen {
    private String customerName;
    private double orderAmount;
    private double discount;

    // Constructor
    public Canteen(String name) {
        this.customerName = name;
        this.orderAmount = 0;
        this.discount = 0;
    }

    // Method to add to order amount
    public void addToOrder(double amount) {
        this.orderAmount += amount;
    }

    // Method to calculate discount based on order amount
    private double calculateDiscount() {
        if (orderAmount >= 500 && orderAmount < 1000) {
            return 0.10 * orderAmount; // 10% discount
        } else if (orderAmount >= 1000) {
            return 0.15 * orderAmount; // 15% discount
        } else {
            return 0; // No discount
        }
    }

    // Method to display billing information
    public void displayBillingInfo() {
        discount = calculateDiscount();
        double totalAmount = orderAmount - discount;
        System.out.println("Customer Name: " + customerName);
        System.out.println("Order Amount: Rs. " + orderAmount);
        System.out.println("Discount: Rs. " + discount);
        System.out.println("Total Amount to be paid: Rs. " + totalAmount);
    }

    // Function overloading: method to take order with different items
    public void takeOrder(String item, double price) {
        System.out.println("Order taken for: " + item + " (Price: Rs. " + price + ")");
        addToOrder(price);
    }

    public void takeOrder(String item1, double price1, String item2, double price2) {
        System.out.println("Order taken for: " + item1 + " (Price: Rs. " + price1 + ") and " + item2 + " (Price: Rs. " + price2 + ")");
        addToOrder(price1 + price2);
    }

    public void takeOrder(String item1, double price1, String item2, double price2, String item3, double price3) {
        System.out.println("Order taken for: " + item1 + " (Price: Rs. " + price1 + "), " + item2 + " (Price: Rs. " + price2 + ") and " + item3 + " (Price: Rs. " + price3 + ")");
        addToOrder(price1 + price2 + price3);
    }

    // Method to check if the canteen is open
    public static boolean isCanteenOpen(String day) {
        return !(day.equalsIgnoreCase("Saturday") || day.equalsIgnoreCase("Sunday"));
    }
}

public class CanteenManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input day of the week
        System.out.print("Enter the day of the week: ");
        String day = scanner.nextLine();

        // Check if the canteen is open
        if (!Canteen.isCanteenOpen(day)) {
            System.out.println("The canteen is closed on weekends. Please come back on a weekday.");
            return;
        }

        // Input customer name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Create Canteen object with customer name
        Canteen canteen = new Canteen(name);

        // Take orders from the customer
        canteen.takeOrder("Burger", 150);
        canteen.takeOrder("Fries", 50);
        canteen.takeOrder("Soda", 30);
        canteen.takeOrder("Pasta", 200);
        canteen.takeOrder("Salad", 100, "Ice Cream", 80);

        // Display billing information
        canteen.displayBillingInfo();

        scanner.close();
    }
}
