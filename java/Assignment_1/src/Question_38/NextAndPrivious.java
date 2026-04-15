package Question_38;

import java.util.Scanner;

public class NextAndPrivious {
    public static void main(String[] h){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the character");
        char c = input.next().charAt(0);
        int i = (int)c;
        int p = i-1;
        int n = ++i;
        char pr = (char)p;
        char ne = (char)n;
        System.out.println("your next character is "+ne+" your privious character is "+pr);
    }
}
