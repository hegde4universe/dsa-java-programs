package stack;

import java.util.Random;
import java.util.Stack;

public class BasicStackOperations {

    public static void main(String[] args) {

        Stack s = new Stack();
        s.push("naga");
        s.push("raj");
        s.push("hegde");
        System.out.println(s.search("naga"));
        System.out.println(s.pop());
        System.out.println(s.size());
        System.out.println(s.peek());
        System.out.println(s);

    }
}
/*
3
hegde
2
raj
[naga, raj]
 */