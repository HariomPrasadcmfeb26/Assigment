package Question_1;

import java.util.Scanner;

public class unit {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        String name;
        long number,amount;
        double unit,total_bill;

        System.out.print("Enter your name: ");
        name = sc.nextLine();

        System.out.print("Enter consumer number: ");
        number = sc.nextLong();

        System.out.print("Enter units consumed: ");
        unit = sc.nextDouble();

        amount=(unit<100)? 5: (unit<200)?7:10;

        total_bill=amount*unit;

        total_bill=(total_bill>1500)?total_bill+ (total_bill*0.05):total_bill;


        System.out.println("Your name is:- "+name);
        System.out.println("Your consumer number is "+number);
        System.out.printf("Your Electricity bill is :- %.2f\n",total_bill);

    }
}