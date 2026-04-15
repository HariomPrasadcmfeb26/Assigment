package Question_3;
import java.util.Scanner;
class stats{
    static int m=10000;
    Scanner s = new Scanner(System.in);

    public void check(){
        System.out.println("your bank balance is "+m);

    }
    public void deposit(){
        System.out.println("please Enter the amount u want to deposit");
       int n = s.nextInt();
        m= m+n;
        System.out.println("Updated balance: " + m);
    }
    public void withdraw(){
        System.out.println("please Enter the amount u want to Withdraw");
        int n = s.nextInt();
        if (n<=m){
             m=m-n;
             System.out.println("your Remaining amount is "+m);
        }
        else {
            System.out.println("Insufficient balance!");
        }
    }
}

public class ATM{
    public static void main(String[] h) {
        Scanner s = new Scanner(System.in);
        stats B = new stats();
        int n,m;
        m=1000;
        while(true) {
        System.out.println("Chose one of the following.");
        System.out.println(" for check Balance press :1");
        System.out.println(" for Deposit Money press :2");
        System.out.println(" for Withdraw money press :3");
        System.out.println(" To Exit: 4");
        n=s.nextInt();

            switch (n) {
                case 1:
                    B.check();
                    break;
                case 2:
                    B.deposit();
                    break;
                case 3:
                    B.withdraw();
                    break;
                case 4:
                    System.out.println("Exiting........");
                    return;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}
