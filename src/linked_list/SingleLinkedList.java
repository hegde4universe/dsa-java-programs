package linked_list;

public class SingleLinkedList {
    Node head;

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(String item) {
        Node newNode = new Node(item);
        if (isEmpty()) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(String item) {
        Node newNode = new Node(item);
        if (isEmpty()) {
            head = newNode;
            return;
        }
        Node currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;

    }

    public void removeFirst() {
        //  a->b->c->null
        if (isEmpty()) {
            System.out.println("LL is empty...");
            return;
        }
        head = head.next;
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("LL is empty...");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node lastNode = head.next;
        Node secondLastNode = head;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLastNode = secondLastNode.next;
        }
        secondLastNode.next = null;
    }

    public void printList() {
        if (isEmpty()) {
            System.out.println("LL is empty");
            ;
            return;
        }
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + "->");
            currentNode = currentNode.next;
        }
        System.out.println("NULL");
    }

    class Node {
        Node next;
        String data;

        public Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        SingleLinkedList linkedList = new SingleLinkedList();
        linkedList.addFirst("the");
        linkedList.addFirst("running");
        linkedList.addFirst("I'm");
        linkedList.addLast("code");
        linkedList.addLast("here");
        linkedList.printList();
        linkedList.removeLast();
        linkedList.removeFirst();
        linkedList.printList();

    }

}
