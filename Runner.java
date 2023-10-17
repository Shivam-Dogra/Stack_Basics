package DSA.Stack;

public class Runner {
    public static void main(String[] args) {
        Stack stack = new Stack(1);
        stack.push(2);
        stack.push(3);
        stack.printStack();
        stack.getTop();
        stack.getHeight();
    }
}
