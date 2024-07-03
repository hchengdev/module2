import java.util.regex.Matcher;
import java.util.regex.Pattern;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String NAME_CLASS = "[C|A|P][0-9]{4}[G|H|I|K]";
        Pattern pt = Pattern.compile(NAME_CLASS);
        Matcher mt = pt.matcher("C0223G");
        System.out.println(mt.matches());
    }
}