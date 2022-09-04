package stack;

import java.util.EmptyStackException;

public class StackUsingLinkedList {

    static class Node<E> {
        E data;
        Node next;

        public Node(E data) {
            this.data = data;
            this.next = null;
        }
    }

    static class CustomStack<E> {
        public static Node head;

        public boolean isEmpty() {
            return head == null;
        }

        public E push(E item) {
            Node newNode = new Node<>(item);
            if (isEmpty()) {
                head = newNode;
                return item;
            }
            newNode.next = head;
            head = newNode;
            return item;
        }

        public E pop() {
            E top = peek();
            head = head.next;
            return top;
        }

        public E peek() {
            if (isEmpty()) {
                throw new EmptyStackException();
            }
            return (E) head.data;
        }

        public int size() {
            Node temp = head;
            int count = 0;
            while (temp != null) {
                temp = temp.next;
                count++;
            }
            return count;
        }
    }

    public static void main(String[] args) {

        CustomStack<String> stack = new CustomStack();
        CustomStack<String> stack1 = new CustomStack();

        stack.push("naga");
        stack.push("raj");
        stack.push("hegde");
        System.out.println(stack.peek());
        System.out.println(stack.size());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.size());

        stack1.push("naga");
        stack1.push("raj");
        stack1.push("hegde");
        System.out.println(stack1.peek());
        System.out.println(stack1.size());
        System.out.println(stack1.pop());
        System.out.println(stack1.pop());
        System.out.println(stack1.pop());
        System.out.println(stack1.size());
    }

}
