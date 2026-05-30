import java.util.Scanner;

abstract class FoodOrder {

    String customerName;
    String address;

    FoodOrder(String customerName, String address) {
        this.customerName = customerName;
        this.address = address;
    }

    abstract void order();

    void display() {
        System.out.println("Customer Name : " + customerName);
        System.out.println("Address : " + address);
    }
}

class FoodItem extends FoodOrder {

    int itemNo;
    String itemName;
    double price;
    int quantity;

    FoodItem(String customerName, String address,
             int itemNo, String itemName,
             double price, int quantity) {

        super(customerName, address);
        this.itemNo = itemNo;
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    void display() {
        super.display();

        double total = price * quantity;
        double discount = total / 1.5;

        System.out.println("Item Number : " + itemNo);
        System.out.println("Item Name : " + itemName);
        System.out.println("Quantity : " + quantity);
        System.out.println("Price : " + price);
        System.out.println("After Discount : " + discount);
    }

    @Override
    void order() {
        System.out.println("Order Placed Successfully");
    }
}

public class Demo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Biryani");
        System.out.println("2. Idly");
        System.out.println("3. Burger");

        System.out.print("Enter Item Number : ");
        int choice = sc.nextInt();

        FoodItem food = null;

        switch (choice) {

            case 1:
                food = new FoodItem(
                        "Navya", "Puttaparthi",
                        1, "Biryani", 100, 2);
                break;

            case 2:
                food = new FoodItem(
                        "Nani", "Bangalore",
                        2, "Idly", 40, 3);
                break;

            case 3:
                food = new FoodItem(
                        "Sita", "Mumbai",
                        3, "Burger", 89, 3);
                break;

            default:
                System.out.println("Item Not Found!");
        }

        if (food != null) {
            food.display();
            food.order();
        }

        sc.close();
    }
}