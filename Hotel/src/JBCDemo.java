import java.sql.*;
public class JBCDemo {
    private static final String url = "jdbc:mysql://localhost:3306/hotel";
    private static final String username = "root";
    private static final String password = "";
    private static Connection connection;

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static Connection getConnection() {
        return connection;
    }
}