package Question_6;

import java.util.*;

class Book {
    int bookId;
    String title;
    String author;
    boolean isAvailable;

    static int totalBooks = 0;

    // Constructor
    Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
        totalBooks++;
    }

    // Issue book
    void issueBook() {
        if (!isAvailable) {
            System.out.println("Book already issued!");
        } else {
            isAvailable = false;
            System.out.println("Book issued: " + title);
        }
    }

    // Return book
    void returnBook() {
        if (isAvailable) {
            System.out.println("Book is already available!");
        } else {
            isAvailable = true;
            System.out.println("Book returned: " + title);
        }
    }

    // Display details
    void display() {
        System.out.println("\n--- Book Details ---");
        System.out.println("Book ID: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Status: " + (isAvailable ? "Available" : "Issued"));
    }
}


public class Lbs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        System.out.print("Enter number of books: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Book " + (i + 1));

            System.out.print("Book ID: ");
            int id = sc.nextInt();

            sc.nextLine();

            System.out.print("Title: ");
            String title = sc.nextLine();

            System.out.print("Author: ");
            String author = sc.nextLine();

            books.add(new Book(id, title, author));
        }

        for (Book b : books) {
            b.issueBook();
            b.issueBook();
            b.returnBook();
            b.display();
        }

        System.out.println("\n-Available Books-");
        for (Book b : books) {
            if (b.isAvailable) {
                System.out.println(b.title);
            }
        }

        System.out.println("\n-Issued Books-");
        for (Book b : books) {
            if (!b.isAvailable) {
                System.out.println(b.title);
            }
        }

        System.out.println("\nTotal Books: " + Book.totalBooks);
    }
}