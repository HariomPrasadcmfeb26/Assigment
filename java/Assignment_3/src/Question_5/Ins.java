package Question_5;

import java.util.*;

class Product {
    int productId;
    String name;
    double price;
    int quantity;

    // Constructor
    Product(int productId, String name, double price, int quantity) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Calculate stock value
    double getStockValue() {
        return price * quantity;
    }

    // Update quantity
    void updateQuantity(int qty) {
        this.quantity += qty;
    }

    // Update price directly
    void updatePrice(double newPrice) {
        this.price = newPrice;
        System.out.println("Price updated to: " + newPrice);
    }

    // Apply discount
    void updatePrice(double discount, boolean isDiscount) {
        if (isDiscount) {
            price = price - (price * discount / 100);
            System.out.println("Price after " + discount + "% discount: " + price);
        }
    }

    // Display details
    void display() {
        System.out.println("\n--- Product Details ---");
        System.out.println("Product ID: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Stock Value: " + getStockValue());
    }
}


public class Ins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Product> products = new ArrayList<>();

        System.out.print("Enter number of products: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Product " + (i + 1));

            System.out.print("Product ID: ");
            int id = sc.nextInt();

            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Price: ");
            double price = sc.nextDouble();

            System.out.print("Quantity: ");
            int qty = sc.nextInt();

            products.add(new Product(id, name, price, qty));
        }

        double totalInventoryValue = 0;

        for (Product p : products) {
            p.updateQuantity(5);
            p.updatePrice(10);
            p.updatePrice(10, true);
            p.display();

            totalInventoryValue += p.getStockValue();
        }

        System.out.println("\nTotal Inventory Value: " + totalInventoryValue);
    }
}