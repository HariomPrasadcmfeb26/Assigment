package Question_4;

import java.util.*;

// ContactDetails class
class ContactDetails {
    String phone;
    String email;

    ContactDetails(String phone, String email) {
        this.phone = phone;
        this.email = email;
    }

    void display() {
        System.out.println("Phone: " + phone);
        System.out.println("Email: " + email);
    }
}

// Patient class
class Patient {
    int patientId;
    String name;
    int age;
    String disease;
    ContactDetails contact;

    static int totalPatients = 0;

    Patient(int patientId, String name, int age, String disease, ContactDetails contact) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.disease = disease;
        this.contact = contact;
        totalPatients++;
    }

    boolean isSenior() {
        return age >= 60;
    }

    void display() {
        System.out.println("\n-Patient Details-");
        System.out.println("ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Disease: " + disease);

        contact.display();

        if (isSenior()) {
            System.out.println("Status: Senior Citizen");
        } else {
            System.out.println("Status: Normal");
        }
    }
}


public class Hs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Patient> patients = new ArrayList<>();

        System.out.print("Enter number of patients: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Patient " + (i + 1));

            System.out.print("Patient ID: ");
            int id = sc.nextInt();

            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Age: ");
            int age = sc.nextInt();

            sc.nextLine();

            System.out.print("Disease: ");
            String disease = sc.nextLine();

            System.out.print("Phone: ");
            String phone = sc.nextLine();

            System.out.print("Email: ");
            String email = sc.nextLine();

            ContactDetails cd = new ContactDetails(phone, email);
            patients.add(new Patient(id, name, age, disease, cd));
        }

        for (Patient p : patients) {
            p.display();
        }

        System.out.println("\nTotal Patients: " + Patient.totalPatients);
    }
}
