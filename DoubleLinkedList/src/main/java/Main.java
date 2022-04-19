public class Main {

    public static void main(String[] args) {
        DoubleLinkedList doubleLinkedList = new DoubleLinkedList();

        // Insert 6. So linked list becomes 6->NULL
        doubleLinkedList.append(6);

        // Insert 7 at the beginning
        doubleLinkedList.push(7);

        // Insert 1 at the beginning
        doubleLinkedList.push(1);

        // Insert 4 at the end
        doubleLinkedList.append(4);

        // Insert 8, after 7
        doubleLinkedList.InsertAfter(doubleLinkedList.head.next, 8);

        // Insert 5, before 8.So linked
        doubleLinkedList.InsertBefore(doubleLinkedList.head.next.next, 5);

        System.out.println("DoubleLinkedList : ");
        doubleLinkedList.printlist(doubleLinkedList.head);
    }
}
