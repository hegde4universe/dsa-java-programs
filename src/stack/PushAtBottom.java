package stack;

import java.util.Stack;

public class PushAtBottom {

    static void pushItemAtBottom(Stack<Integer> s, int item) {
        if (s.empty()) {
            s.push(item);
            return;
        }
        int top = s.pop();
        pushItemAtBottom(s, item);
        s.push(top);

    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(2);
        s.push(3);
        s.push(4);
        pushItemAtBottom(s,1);
        System.out.println(s);

    }
}
