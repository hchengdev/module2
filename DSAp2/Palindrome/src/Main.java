import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String palindrome = "Able was I ere I saw Elba";
        Queue<String> readString = new LinkedList<>();
        Stack<String> stack = new Stack<>();

        palindrome = palindrome.replaceAll("\\s+", "").toLowerCase();


        for (int i = 0; i < palindrome.length(); i++) {
            char c = palindrome.charAt(i);
            System.out.println(readString.add(c + ""));
            System.out.println(stack.push(c + ""));
        }

        boolean isPalindrome = true;
        for (int i = 0; i < palindrome.length(); i++) {
            if(!readString.remove().equals(stack.pop())) {
                isPalindrome = false;
                break;
            }
        }

        if(isPalindrome) {
            System.out.println("Is Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}