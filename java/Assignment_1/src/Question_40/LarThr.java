package Question_40;
import java.util.Scanner;
public class LarThr {
    public static void main(String[] h){
           Scanner input= new Scanner(System.in);
           int n,l,m;
           System.out.println("Enter the three number u want to compare ");
           n=input.nextInt();
           l=input.nextInt();
           m=input.nextInt();
           int a = (n > l && n > m) ? n : (l > m ? l : m);
           System.out.println("The largest number is "+a);
    }
}
