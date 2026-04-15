package Question_2;

import java.util.Scanner;

class stu{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String name;
        float percentage;
        int total,average,conditions;
        int roll,subject1,subject2,subject3,subject4,subject5;

        System.out.println("Enter your name:");
        name=sc.next();
        System.out.println("Enter your roll:");
        roll=sc.nextInt();
        System.out.println("Enter your science marks:-");
        subject1=sc.nextInt();
        System.out.println("Enter your Maths marks:");
        subject2=sc.nextInt();
        System.out.println("Enter your social science marks:");
        subject3=sc.nextInt();
        System.out.println("Enter your  English marks:");
        subject4=sc.nextInt();
        System.out.println("Enter your Hindi marks:");
        subject5=sc.nextInt();

        total=subject1+subject2+subject3+subject4+ subject5;
        average=total/5;
        percentage=total/5.0f;
        if(percentage>90) {
            System.out.println("A");
        }
        else if (percentage > 75 && percentage <= 90) {
            System.out.println("B");
        }
        else if (percentage > 60 && percentage <= 74){
            System.out.println("C");
        }
        else if(percentage > 40 && percentage <= 59){
            System.out.println("D");
        }
        else if(40>percentage){
            System.out.println("Fail");
        }
        System.out.println("your Percentage is :-"+percentage);

        if(percentage>40){
            System.out.println("student is promoted");
        }
        else{
            System.out.println("student is not promoted");
        }

    }

}

