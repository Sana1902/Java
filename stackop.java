import java.util.Stack;

public class stackop {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Push elements onto the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println("Stack elements: " + stack);

        // Pop and print elements from the stack
        while (!stack.isEmpty()) {
            System.out.println("Popped: " + stack.pop());
        }

        System.out.println("Stack is empty: " + stack.isEmpty());
    }
}
