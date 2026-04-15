package Question_7;

import java.util.*;

class Employee {
    int empId;
    String name;
    double salary;

    static int totalEmployees = 0;

    // Constructor
    Employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
        totalEmployees++;
    }

    // Salary calculation (basic)
    double calculateSalary() {
        return salary;
    }

    // Salary with allowance %
    double calculateSalary(double allowancePercent) {
        return salary + (salary * allowancePercent / 100);
    }

    // Salary with fixed bonus
    double calculateSalary(double bonus, boolean isFixed) {
        if (isFixed) {
            return salary + bonus;
        }
        return salary;
    }

    // Display details
    void display() {
        System.out.println("\n-Employee Details-");
        System.out.println("ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Base Salary: " + salary);
        System.out.println("Salary with 10% Allowance: " + calculateSalary(10));
        System.out.println("Salary with Fixed Bonus (2000): " + calculateSalary(2000, true));
    }
}


public class Es {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<>();

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1));

            System.out.print("Employee ID: ");
            int id = sc.nextInt();

            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Salary: ");
            double salary = sc.nextDouble();

            employees.add(new Employee(id, name, salary));
        }

        for (Employee e : employees) {
            e.display();
        }

        System.out.println("\nTotal Employees: " + Employee.totalEmployees);
    }
}
