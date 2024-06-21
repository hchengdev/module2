import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        String syms = "s * (s – a) * (s – b) * (s – c)";
        Stack<String> stack = new Stack<>();

        for (int i = 0; i < syms.length(); i++) {
            char a = syms.charAt(i);
            if (a == '(' || a == '{' || a == '[') {
                stack.add(String.valueOf(a));
            } else if (a == ')' || a == '}' || a == ']') {
                if (stack.isEmpty()) {
                    System.out.println("Unmatched closing bracket: " + a);
                    return;
                }
                String pop = stack.pop();
                if (!((pop.equals("(") && a == ')') ||
                        (pop.equals("{") && a == '}') ||
                        (pop.equals("[") && a == ']'))) {
                    System.out.println("Mismatched brackets: " + pop + " and " + a);
                    return;
                }
            }
        }

        if (stack.isEmpty()) {
            System.out.println("All brackets are matched and balanced.");
        } else {
            System.out.println("Unmatched opening bracket(s): " + stack);
        }
    }
}