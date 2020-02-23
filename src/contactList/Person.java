package contactList;

public class Person {
    String fName;
    String lName;
    LinkList<String> cNum;
    String email;

    public Person(String fName, lName, cNum, email) {
        this.fName = fName;
        this.lName = lName;
        this.cNum = cNum;
        this.email = email;
    }
}
