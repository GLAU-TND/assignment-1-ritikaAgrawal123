package contactList;

import java.util.Scanner;

public class ContactList {
    LinkList<Person> list = new LinkList<>();
    private Scanner scan = new Scanner(System.in);

    public void add() {
        System.out.println("You have chosen to add a new contact:");
        System.out.println("Please enter the name of the Person");
        System.out.print("First Name: ");
        String fname = scan.next();
        fname = fname.substring(0, 1).toUpperCase() + fname.substring(1);
        System.out.print("Last Name: ");
        String lname = scan.next();
        lname = lname.substring(0, 1).toUpperCase() + lname.substring(1);
        LinkList<String> cnum = new LinkList<>();
        System.out.print("Contact Number");
        cnum.add(scan.next());
        while (true) {
            System.out.print("Would you like to add another contact number? (y/n):");
            char c = scan.next().charAt(0);
            if (c == 'n') break;
            else cnum.add(scan.next());

        }
        System.out.println("Would you like to add email address? (y/n):");
        String email = "";
        if (scan.next().charAt(0) == 'y') {
            System.out.println("Email Address:");
            email = scan.next();
        }
        Person person = new Person(fname, lname, cnum, email);
        list.addSort(person);
    }

    public void view() {
        System.out.println("---Here are all your contacts---");
        for (Person p : list) {
            System.out.println("-------- * -------- * -------- * --------");
            System.out.println(p);
            System.out.println("-------- * -------- * -------- * --------");
        }
    }

    public void search() {
        System.out.println("You could search for a contact from their first names:");
        String name = scan.next();
        LinkList<Person> slist = new LinkList<>();
        for (Person p : list) {
            if (name.compareToIgnoreCase(p.getfName()) == 0) {
                slist.add(p);
                continue;
            }
            if (slist.len() > 0) {
                break;
            }
        }
        System.out.println(slist.len() + " match found!");
        for (Person p : slist) {
            System.out.println("-------- * -------- * -------- * --------");
            System.out.println(p);
            System.out.println("-------- * -------- * -------- * --------");
        }
    }

    public void delete() {
        System.out.println("Here are all your contacts: ");
        int count = 1;
        for (Person p : list) {
            System.out.println(count + " " + p.getfName() + " " + p.getlName());
            count++;
        }
        System.out.println("Press the number against the contact to delete it:");
        Person temp = list.remove(scan.nextInt());
        System.out.println(temp.getfName() + "'s contact deleted from list!\n");
    }
}
