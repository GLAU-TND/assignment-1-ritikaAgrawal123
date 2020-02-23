package contactList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ContactList contList = new ContactList();
        while (true) {
            System.out.println("Welcome to DBC's Contact List App\n" +
                    "Press 1 to add a new contact\n" +
                    "Press 2 to view all contacts\n" +
                    "Press 3 to search for a contact\n" +
                    "Press 4 to delete a contact\n" +
                    "Press 5 to exit program ");
            char choice = scan.next().charAt(0);
            if (choice == '1') {
                contList.add();
            } else if (choice == '2') {
                contList.view();
            } else if (choice == '3') {
                contList.search();
            } else if (choice == '4') {
                contList.delete();
            } else if (choice == '5') {
                break;
            } else {
                System.out.println("please place right choice");
            }
        }
    }
}
