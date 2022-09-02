package stack;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class StackUsingArrayList {

   static class CustomStack<E> {

        List<E> list = new ArrayList<>();

        public boolean isEmpty() {
            return list.size() == 0;
        }

        public E push(E item) {
            list.add(item);
            return item;
        }

        public E pop() {
            E obj = peek();
            list.remove(list.size() - 1);
            return obj;
        }

        public E peek(){
            if(isEmpty()) {
                throw new EmptyStackException();
            }
            return list.get(list.size() - 1);
        }

   }

    public static void main(String[] args) {
        CustomStack<String> stack = new CustomStack<>();
        stack.push("naga");
        stack.push("raj");
        stack.push("hegde");
        System.out.println(stack.pop());
        System.out.println(stack.peek());
    }
}
