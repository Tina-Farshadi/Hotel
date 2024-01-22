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
}