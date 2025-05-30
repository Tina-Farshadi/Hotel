package Models;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class EmailValidator {

    public boolean CheckEmail(String email) {

        Pattern pattern = Pattern.compile("^[a-zA-Z0-9]+([._]?[a-zA-Z0-9]+)*@[a-zA-Z0-9]+\\.[a-zA-Z]{2,}$");
        Matcher matcher = pattern.matcher(email);
        if (matcher.find()) {
            return true;
        } else
            return false;
    }
}