
public class DoubleLinkedList {

    Node head;

    class Node {

        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
        }
    }

    // Adding a node at the front of the list
    public void push(int new_data) {
        Node new_Node = new Node(new_data);


        new_Node.next = head;
        new_Node.prev = null;

        if (head != null)
            head.prev = new_Node;

        head = new_Node;
    }

    // Add a node before the given node
    public void InsertBefore(Node next_node, int new_data) {
        /*Check if the given nx_node is NULL*/
        if (next_node == null) {
            System.out.println("The given next node can not be NULL");
            return;
        }

        Node new_node = new Node(new_data);

        new_node.prev = next_node.prev;

        next_node.prev = new_node;

        new_node.next = next_node;

        if (new_node.prev != null)
            new_node.prev.next = new_node;
        else
            head = new_node;
    }

    /* Given a node as prev_node, insert
    a new node after the given node */
    public void InsertAfter(Node prev_Node, int new_data) {

        /*1. check if the given prev_node is NULL */
        if (prev_Node == null) {
            System.out.println("The given previous node cannot be NULL ");
            return;
        }

        Node new_node = new Node(new_data);

        new_node.next = prev_Node.next;

        prev_Node.next = new_node;

        new_node.prev = prev_Node;

        if (new_node.next != null)
            new_node.next.prev = new_node;
    }

    // Add a node at the end of the list
    void append(int new_data) {
        Node new_node = new Node(new_data);

        Node last = head; /* used in step 5*/

        new_node.next = null;

        if (head == null) {
            new_node.prev = null;
            head = new_node;
            return;
        }

        while (last.next != null)
            last = last.next;

        last.next = new_node;

        new_node.prev = last;
    }

    public void printlist(Node node) {
        Node last = null;
        System.out.println("Forward direction");
        while (node != null) {
            System.out.print(node.data + " ");
            last = node;
            node = node.next;
        }
        System.out.println();
        System.out.println("Reverse direction");
        while (last != null) {
            System.out.print(last.data + " ");
            last = last.prev;
        }
    }
}
