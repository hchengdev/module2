import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập một chuỗi: ");
        String input = scanner.nextLine();

        String longestOrderedSubstring = findLongestOrderedSubstring(input);
        System.out.println("Chuỗi con có thứ tự dài nhất: " + longestOrderedSubstring);
    }

    private static String findLongestOrderedSubstring(String input) {
        if (input == null || input.isEmpty()) {
            return "";
        }
        String maxSubstr = "";
        String currentSubstr = "";
        for (int i = 0; i < input.length(); i++) {
            if(currentSubstr.isEmpty() || input.charAt(i) >= currentSubstr.charAt(currentSubstr.length() - 1)) {
                currentSubstr += input.charAt(i);
            } else {
                if(currentSubstr.length() > maxSubstr.length()) {
                    maxSubstr = currentSubstr;
                }
                currentSubstr = "" + input.charAt(i);
            }
        }
        if (currentSubstr.length() > maxSubstr.length()) {
            maxSubstr = currentSubstr;
        }
        return maxSubstr;
    }
}