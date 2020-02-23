package contactList;

public class Person implements Comparable<Person> {
    private String fName;
    private String lName;
    private LinkList<String> cNum;
    private String email;

    public Person(String fName, String lName, LinkList<String> cNum, String email) {
        this.fName = fName;
        this.lName = lName;
        this.cNum = cNum;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LinkList<String> getcNum() {
        return cNum;
    }

    public void setcNum(LinkList<String> cNum) {
        this.cNum = cNum;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    @Override
    public int compareTo(Person o) {
        return fName.compareToIgnoreCase(o.fName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("First Name:" + fName + "\n" +
                "Last Name:" + lName + "\n");
        if (cNum.len() > 1) {
            sb.append("Contact Number(s):");
            for (String cn : cNum) {
                sb.append(cn + " ,");
            }
            sb.deleteCharAt(sb.length() - 1);
        } else {
            sb.append("Contact Number: " + cNum.peekFirst());
        }
        if (email != "") {
            sb.append("\nEmail address: " + email);
        }
        return sb.toString();
    }
}
