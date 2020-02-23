package contactList;

public class LinkList<T> {
    private Node head;
    private int len;

    public void add(T data) {
        Node temp = new Node(data);
        if (head == null) {
            head = temp;
        } else {
            temp.next = head;
            head = temp;
        }
        len++;
    }

    public void addSort(T data) {
        Node temp = new Node(data);
        if (head == null) head = temp;
        else {
            while () {
                if ()
            }
        }
    }

    public Node search(T data) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == data) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    public void remove(int pos) {

    }

    public void view() {
        Node temp =
        while (temp != null)
    }

    private class Node<T> {
        T data;
        Node next = null;

        Node(T data) {
            this.data = data;
        }
    }
}
