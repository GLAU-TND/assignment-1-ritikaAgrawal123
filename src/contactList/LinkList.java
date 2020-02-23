package contactList;

public class LinkList<T extends Comparable<T>> implements Iterable<T> {
    private Node<T> head = null;
    private int len = 0;

    public int len() {
        return len;
    }

    public T peekFirst() {
        return head.data;
    }
    public void add(T data) {
        Node<T> temp = new Node(data);
        if (head == null) {
            head = temp;
        } else {
            temp.next = head;
            head = temp;
        }
        len++;
    }

    public void addSort(T data) {
        Node<T> temp = new Node(data);
        len++;
        if (head == null) {
            head = temp;
            return;
        }
        else {
            Node<T> cur = head;
            if (data.compareTo(head.data) <= 0) {
                add(data);
                return;
            }
            while (cur.next != null) {
                if (data.compareTo(cur.next.data) <= 0) {
                    temp.next = cur.next;
                    cur.next = temp;
                    return;
                }
                cur = cur.next;
            }
            temp.next = null;
            cur.next = temp;
        }
    }

    public T remove(int pos) {
        Node<T> cur = head;
        T data = head.data;
        if (pos == 1) {
            head = head.next;
        } else {
            for (int i = 1; i < pos - 1; i++) {
                cur = cur.next;
            }
            data = cur.next.data;
            cur.next = cur.next.next;
        }
        len--;
        return data;
    }

    @Override
    public java.util.Iterator<T> iterator() {
        return new java.util.Iterator<T>() {
            private Node<T> trav = head;

            @Override
            public boolean hasNext() {
                return trav != null;
            }

            @Override
            public T next() {
                T data = trav.data;
                trav = trav.next;
                return data;
            }
        };
    }

    private class Node<T> {
        T data;
        Node<T> next = null;

        Node(T data) {
            this.data = data;
        }
    }

}
