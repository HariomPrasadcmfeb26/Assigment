package Question_8;

import java.util.*;

class Order {
    int orderId;
    String customerName;
    String[] items;
    double[] prices;

    // Constructor
    Order(int orderId, String customerName, String[] items, double[] prices) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.items = items;
        this.prices = prices;
    }

    // Calculate total
    double getTotal() {
        double sum = 0;
        for (double p : prices) {
            sum += p;
        }
        return sum;
    }

    // Apply GST (18%)
    double getFinalBill() {
        double total = getTotal();
        double gst = total * 0.18;
        return total + gst;
    }

    // Display bill
    void display() {
        System.out.println("\n-Order Bill-");
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer Name: " + customerName);

        System.out.println("Items:");
        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i] + " - " + prices[i]);
        }

        System.out.println("Total: " + getTotal());
        System.out.println("Final Bill (with GST): " + getFinalBill());
    }
}


public class Ors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Order> orders = new ArrayList<>();

        System.out.print("Enter number of orders: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Order " + (i + 1));

            System.out.print("Order ID: ");
            int id = sc.nextInt();

            sc.nextLine();

            System.out.print("Customer Name: ");
            String name = sc.nextLine();

            System.out.print("Number of items: ");
            int m = sc.nextInt();

            String[] items = new String[m];
            double[] prices = new double[m];

            sc.nextLine();

            for (int j = 0; j < m; j++) {
                System.out.print("Item " + (j + 1) + " name: ");
                items[j] = sc.nextLine();

                System.out.print("Price: ");
                prices[j] = sc.nextDouble();
                sc.nextLine();
            }

            orders.add(new Order(id, name, items, prices));
        }

        for (Order o : orders) {
            o.display();
        }
    }
}