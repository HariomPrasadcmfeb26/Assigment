package Question_36;
import java.util.Scanner;
public class typecasting {
    public static void main(String [] h){
        int a;
        double d;
        Scanner input= new Scanner(System.in);

        System.out.println("enter a integer number:");
        a=input.nextInt();

        System.out.println("enter a Double number:");
        d=input.nextDouble();

        double dl = (double) a;
        int in = (int) d;
        System.out.println("your integer number in double will be:"+dl+"\nyour double number in integer will be:"+in);
    }
}
