package stack;

import java.util.Queue;
import java.util.Stack;

public class ReverseTheStack {

    static void reverse(Stack<Integer> s) {
        if (s.empty()) {
            return;
        }
        int top = s.pop();
        reverse(s);
        PushAtBottom.pushItemAtBottom(s, top);

    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(2);
        s.push(3);
        s.push(4);
        reverse(s);
        System.out.println(s);
    }
}
