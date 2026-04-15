package Question_1;

import java.util.*;

class student {
    int Roll_number;
    String phoneNumber;
    String name;
    String Email;
    double[] marks;

    static int totalStudents = 0;

    student(int Roll_number, String name, double[] marks, String Email, String phoneNumber) {
        this.Roll_number = Roll_number;
        this.name = name;
        this.marks = marks;
        this.Email = Email;
        this.phoneNumber = phoneNumber;
        totalStudents++;
    }

    double getTotal() {
        double sum = 0;
        for (double m : marks) {
            sum += m;
        }
        return sum;
    }

    double getAverage() {
        return getTotal() / marks.length;
    }

    void displayReport() {
        System.out.println("\n--- Student Report ---");
        System.out.println("Roll no: " + Roll_number);
        System.out.println("Name: " + name);
        System.out.println("Phone number: " + phoneNumber);
        System.out.println("Email: " + Email);

        System.out.print("Marks: ");
        for (double m : marks) {
            System.out.print(m + " ");
        }

        System.out.println("\nTotal: " + getTotal());
        System.out.println("Average: " + getAverage());
    }
}

public class CollegeERP {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<student> students = new ArrayList<>();

        System.out.println("Enter number of Students: ");
        int n = s.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for student " + (i + 1));

            System.out.print("Roll no: ");
            int roll = s.nextInt();

            s.nextLine();

            System.out.print("Name: ");
            String name = s.nextLine();

            System.out.print("Number of subjects: ");
            int sub = s.nextInt();

            double[] marks = new double[sub];
            for (int j = 0; j < sub; j++) {
                System.out.print("Enter marks for subject " + (j + 1) + ": ");
                marks[j] = s.nextDouble();
            }

            s.nextLine();

            System.out.print("Phone: ");
            String phone = s.nextLine();

            System.out.print("Email: ");
            String email = s.nextLine();

            students.add(new student(roll, name, marks, email, phone));
        }

        for (student st : students) {
            st.displayReport();
        }

        System.out.println("\nTotal Students Admitted: " + student.totalStudents);
    }
}