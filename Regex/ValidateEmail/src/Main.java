//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static final String[] validEmail = new String[]{"a@gmail.com", "ab@yahoo.com", "abc@hotmail.com"};
    public static final String[] invalidEmail = new String[]{"@gmail.com", "ab@gmail.", "@#abc@gmail.com"};
    public static void main(String[] args) {
        EmailExample emailExample = new EmailExample();
        for (String email : validEmail) {
            boolean valid = emailExample.validateEmail(email);
            System.out.println("Email is " + email + " is valid: " + valid);
        }
        for (String email : invalidEmail) {
            boolean valid = emailExample.validateEmail(email);
            System.out.println("Email is " + email + " is valid: " + valid);
        }
    }
}