import java.util.regex.Matcher;
import java.util.regex.Pattern;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String PHONE_NUMBER_REGEX = "\\([0-9]{2}\\)-\\([0-9]{10}\\)";
        Pattern pattern = Pattern.compile(PHONE_NUMBER_REGEX);
        Matcher matcher = pattern.matcher("(84)-(0978489648)");
        System.out.println(matcher.matches());
    }
}