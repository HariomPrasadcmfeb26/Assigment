package Question_35;
import java.util.Scanner;
class calculation{
    public void add(int a,double b){
        double add,dev;
        add=a+b;
        dev=a/b;
        int cast = (int)add;
        int di = (int) dev;
        System.out.println("the addition of the 2 number will be:"+cast+"\nThe devision of the 2 number will be:"+di);
    }


}
public class typecasting {
    public static void main(String[] args){
        int a;
        double d;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the interger:");
         a=sc.nextInt();
        System.out.println("enter the Double:");
         d=sc.nextDouble();
         calculation obj = new calculation();
         obj.add(a,d);
    }
}
