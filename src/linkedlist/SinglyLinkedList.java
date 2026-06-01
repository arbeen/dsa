package linkedlist;

public class SinglyLinkedList {
    Node head;
    Node tail;

    int length = 0;

    public void insertEnd(int n) {
        Node node = new Node(n);
        node.next = null;
        if (head == null && tail == null) {
            head = tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        length++;
    }

    public void removeEnd() {
        if (head == null) {
            return;
        }
        Node cur = head;
        if (cur.next == null) {
            head = null;
            tail = null;
            length--;
            return;
        }
        while (cur.next != tail) {
            cur = cur.next;
        }
        tail = cur;
        tail.next = null;
        length--;
    }

    public void insertFront(int n) {
        Node newNode = new Node(n);
        if (head == null && tail == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    public void removeFront() {
        if (head == null) {
            return;
        }
        if (head == tail) {
            head = tail = null;
            length--;
            return;
        }

        head = head.next;
        length--;
    }

    public void insertAtIndex(int n, int pos) {

        if (pos < 0 || pos > length) {
            return;
        }

        // insertFront
        if (pos == 0) {
            insertFront(n);
            return;
        }
        // insertEnd
        if (pos == length) {
            insertEnd(n);
            return;
        }
        // regular list
        Node cur = head;
        Node newNode = new Node(n);
        for (int i = 0; i < pos - 1; i++) {
            cur = cur.next;
        }
        newNode.next = cur.next;
        cur.next = newNode;
        length++;
    }

    public void removeAtIndex(int pos) {
        if (pos < 0 || pos > length - 1) {
            return;
        }
        if (pos == 0) {
            removeFront();
            return;
        }
        Node cur = head;
        for (int i = 0; i < pos - 1; i++) {
            cur = cur.next;
        }
        if (pos == length - 1) {
            removeEnd();
            return;
        }
        cur.next = cur.next.next;

        length--;
    }

    public boolean contains(int n) {
        Node cur = head;
        while (cur != null) {
            if (cur.value == n) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    public int indexOf(int n) {
        Node cur = head;
        int i = 0;
        while (cur != null) {
            if (cur.value == n) {
                return i;
            }
            i++;
            cur = cur.next;
        }
        return -1;
    }

    public Node get(int pos) {
        Node cur = head;
        int i = 0;
        while (cur != null) {
            if (i == pos) {
                return cur;
            }
            i++;
            cur = cur.next;
        }
        return null;
    }

    public void print() {
        Node cur = head;
        while (cur != null) {
            System.out.printf("%d ", cur.value);
            cur = cur.next;
        }
        System.out.println();
    }
}
