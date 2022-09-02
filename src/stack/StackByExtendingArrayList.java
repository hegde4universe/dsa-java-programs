package stack;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class StackByExtendingArrayList<E> extends ArrayList {

        public E push(E item) {
            add(item);
            return item;
        }

        public synchronized E pop() {
            E obj = peek();
            remove(size() - 1);
            return obj;
        }

        public synchronized E peek() {
            if (size() == 0)
                throw new EmptyStackException();
            return (E) get(size() - 1);
        }

}
