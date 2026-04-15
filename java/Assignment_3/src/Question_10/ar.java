package Question_10;
import java.io.*;
import java.util.*;

public class ar{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        int[] c= new int[2];
        try {
            for (int i=0; i<2; i++){
                c[i]=s.nextInt();
            }
            int r = c[0]/c[1];
            System.out.println(r);
        }
        catch(ArithmeticException  e){
            System.out.println("Division by zero error");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index error");
        }
        catch(InputMismatchException e){
            System.out.println("Array index error");
        }
    }
}