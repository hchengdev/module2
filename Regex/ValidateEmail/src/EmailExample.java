import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailExample {
    private static Pattern pt;
    private Matcher matcher;

    private static final String EMAIL_REGEX = "^[A-Za-z0-9]+[A-Za-z0-9]*@+[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
    public EmailExample() {
        pt = Pattern.compile(EMAIL_REGEX);
    }

    public boolean validateEmail(String email) {
        matcher = pt.matcher(email);
        return matcher.matches();
    }
}
