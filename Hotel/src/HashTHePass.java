import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class HashTHePass {

    private int level;

    public HashTHePass() {
        this.level = 0;
    }

    public int rconizeLevel(String password) {

        boolean lowercase = password.matches(".*[a-z].*");
        boolean uppercase = password.matches(".*[A-Z].*");
        boolean numbers = password.matches(".*\\d.*");
        boolean characters = password.matches(".*[.\\-_@].*");
        boolean length = password.length() > 8;

        if (lowercase)
            level++;
        if (uppercase)
            level++;
        if (numbers)
            level++;
        if (characters)
            level++;
        if (length)
            level++;

        return level;
    }

    public static String getSHA(String password) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] encodedHash = digest.digest(password.getBytes(StandardCharsets.UTF_8));
            StringBuilder hexString = new StringBuilder();
            for (byte b : encodedHash) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) {
                    hexString.append('0');
                }
                hexString.append(hex);
            }
            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        return null;
    }
}