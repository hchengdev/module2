import java.util.Stack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println(stack);

        Stack stack2 = new Stack();
        stack2.push(stack.pop());
        stack2.push(stack.pop());
        stack2.push(stack.pop());
        stack2.push(stack.pop());

        System.out.println(stack2);
    }
}