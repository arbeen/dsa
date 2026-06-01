package linkedlist;

public class LinkedList {
    public static void main(String[] args) {

        SinglyLinkedList sll = new SinglyLinkedList();

        System.out.println("=== Initial Inserts ===");
        sll.insertFront(-1);
        sll.insertFront(-2);
        sll.insertEnd(1);
        sll.insertEnd(2);
        sll.print(); // -2 -1 1 2

        System.out.println("\n=== Insert At Index ===");
        sll.insertAtIndex(99, 0); // front
        sll.print(); // 99 -2 -1 1 2

        sll.insertAtIndex(88, 3); // middle
        sll.print(); // 99 -2 -1 88 1 2

        sll.insertAtIndex(77, 6); // end
        sll.print(); // 99 -2 -1 88 1 2 77

        System.out.println("\n=== Remove At Index ===");
        sll.removeAtIndex(0); // remove front
        sll.print(); // -2 -1 88 1 2 77

        sll.removeAtIndex(2); // remove middle
        sll.print(); // -2 -1 1 2 77

        sll.removeAtIndex(4); // remove end
        sll.print(); // -2 -1 1 2

        System.out.println("\n=== Remove Front / End ===");
        sll.removeFront();
        sll.print(); // -1 1 2

        sll.removeEnd();
        sll.print(); // -1 1

        System.out.println("\n=== Search ===");
        System.out.println("Contains 1: " + sll.contains(1));
        System.out.println("Contains 100: " + sll.contains(100));

        System.out.println("Index of -1: " + sll.indexOf(-1));
        System.out.println("Index of 1: " + sll.indexOf(1));
        System.out.println("Index of 100: " + sll.indexOf(100));

        System.out.println("\n=== Get ===");
        Node node = sll.get(0);
        if (node != null) {
            System.out.println("Index 0: " + node.value);
        }

        node = sll.get(1);
        if (node != null) {
            System.out.println("Index 1: " + node.value);
        }

        node = sll.get(100);
        System.out.println("Index 100: " + node);
    }
}