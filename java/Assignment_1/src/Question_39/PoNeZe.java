package Question_39;

import java.util.Scanner;

public class PoNeZe {
    public static void main(String[] h){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number u want to check");
        int n = input.nextInt();
        if(n>0){
            System.out.println(n+" the number is positive");
        }
        else if (n<0) {
            System.out.println(n+" the number is negative");
        }
        else{
            System.out.println(n+" the number is zero");
        }
    }
    }

