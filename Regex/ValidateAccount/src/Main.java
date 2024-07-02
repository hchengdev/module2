//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static final String[] validAccount = new String[]{"123abc_", "_abc123", "______", "123456", "abcdefgh"};
    public static final String[] invalidAccount = new String[]{".@", "12345", "1234_", "abcde"};
    public static void main(String[] args) {
        AccountExample example = new AccountExample();
        for (String s : validAccount ) {
            boolean success = example.validateAccount(s);
        }

    }
}