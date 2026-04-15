package Question_5;

import java.util.Scanner;

public class salary {
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       int n;
       System.out.println("Enter the number of Employee");
       n = input.nextInt();
       String[] name = new String[n];
       long[] id = new long[n];
       double[] salary= new double[n];

        System.out.println("employ list:");

       for (int i = 0; i<n; i++){

           System.out.println("\nEnter the employee name:");
            name[i]=input.next();
           System.out.println("Enter the employee ID:");
            id[i]= input.nextLong();
            System.out.println("Enter the employee Salary:");
           salary[i]= input.nextDouble();
       }
       System.out.println("----Employee list-----");


       for(int i = 0; i<n; i++){

           System.out.println("\nEmployee name: "+name[i]);
           System.out.println("Employee ID: "+id[i]);
           System.out.println(name[i]+" Actual Salary is "+salary[i]);

           double d = salary[i] * 0.20;
           System.out.println(name[i]+" HRA is:"+d);

           double l = salary[i] * 0.10;
           System.out.println(name[i]+" DA is:"+l);

           double p = salary[i] * 0.08;
           System.out.println(name[i]+" PF is:"+p);

           double s = salary[i]+d+l;
               s = s-p;
           System.out.println("Employee net Salary is :"+s);

       }
    }


}
