package stack;

public class StackByExtendingArrayListMain {

    public static void main(String[] args) {
        StackByExtendingArrayList<String> stack = new StackByExtendingArrayList<>();
        stack.push("naga");
        stack.push("raja");
        stack.push("hegde");
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.pop());

    }
}
