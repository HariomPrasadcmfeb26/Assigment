package Question_37;

import java.util.Scanner;

public class ASCII {
    public static void main(String[] h) {
        char c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character to knows it's ASCII value");
        c = sc.next().charAt(0);
        int asci = (int)c;
        System.out.println("ASCII value of "+c+" is "+asci);
    }
    
}
