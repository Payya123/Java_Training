public class Circularlinkedlist {

    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    // Insert at end
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            newNode.next = head; // Point to itself
            return;
        }
        Node temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.next = head; // Point to head
    }

    // Display the list
    public void display() {
        if (head == null) return;
        Node temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }

    // Main method for testing
    public static void main(String[] args) {
        Circularlinkedlist cll = new Circularlinkedlist();
        cll.insert(10);
        cll.insert(20);
        cll.insert(30);
        System.out.print("Circular Linked List: ");
        cll.display();
    }
}
