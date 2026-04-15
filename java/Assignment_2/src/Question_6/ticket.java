package Question_6;
import java.util.Scanner;

class menu{
    static int[] seats = new int[10];
     Scanner s=new Scanner(System.in);
    public void Viewseats(){
        int a = 0;
        for(int i=0; i<seats.length;i++){
            if(seats[i]==0){
             a++;
            }
        }
        System.out.println("available seat are "+a);
    }

    public void Book(){
        System.out.println("Enter seat number to book (1-10):");
        int seat = s.nextInt();

        if (seat >= 1 && seat <= 10) {
            // Check if the seat is available
            if (seats[seat - 1] == 0) {
                seats[seat - 1] = 1;  // Mark seat as booked
                System.out.println("Seat " + seat + " booked successfully.");
            } else {
                System.out.println("Seat " + seat + " is already booked.");
            }
        } else {
            System.out.println("Invalid seat number. Please enter a number between 1 and 10.");
        }
    }
    public void cancel(){
        System.out.println("Enter seat number to cancel (1-10):");
        int seat = s.nextInt();  // Read user input

        if (seat >= 1 && seat <= 10) {
            // Check if the seat is booked
            if (seats[seat - 1] == 1) {
                seats[seat - 1] = 0;
                System.out.println("Seat " + seat + " has been cancelled.");
            } else {
                System.out.println("Seat " + seat + " is not booked.");
            }
        } else {
            System.out.println("Invalid seat number. Please enter a number between 1 and 10.");
        }
    }
}



public class ticket {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        menu s = new menu();

        while(true){
        System.out.println("--select the any one from the menu--");
        System.out.println("for view available seats chose: 1");
        System.out.println("to book a seats chose:          2");
        System.out.println("to cancel a seats chose:        3");
        System.out.println("to Exit:                        4");
        int n = input.nextInt();

        switch(n) {
            case 1:
                s.Viewseats();
                break;
            case 2:
                s.Book();
                break;
            case 3:
                s.cancel();
                break;
            case 4:
                System.out.println("Exiting..........");
                return;
            default:
                System.out.println("invalid choice");
                break;
        }
        }
    }
}
