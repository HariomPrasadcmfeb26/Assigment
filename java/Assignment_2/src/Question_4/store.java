package Question_4;
import java.util.Scanner;
public class store {
    public static void main(String[] h){
        Scanner s=new Scanner(System.in);
         System.out.println("Enter the number of the item:");
         int n = s.nextInt();
         double total=0;
        String[] itemName=new String[n];
        long[] quantity=new long[n];
        double[] price = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nItem " + (i + 1));

            System.out.print("Name: ");
            itemName[i] = s.next();

            System.out.print("Quantity: ");
            quantity[i] = s.nextInt();

            System.out.print("Price: ");
            price[i] = s.nextDouble();
        }
      System.out.println("-----BILL-----");
        for(int i=0; i<n; i++){
            double itemtotal = quantity[i] * price[i];
            total = total + itemtotal;
            System.out.println(itemName[i]+"-->"+itemtotal);
        }
        System.out.println("your total bill is: "+total);

        if(total>3000){
            double dis = total*0.10;
            total = total - dis;
            System.out.println("after 10% discount your Total bill= "+total);
        }
        else{
            System.out.println("Your will is under 3000 so no Discount = "+total);
        }

    }
}
