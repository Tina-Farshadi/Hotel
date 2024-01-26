package Data;
import java.sql.*;
public class JBCDemo {
    public static Connection connection;
    private static final String url = "jdbc:mysql://localhost:3306/Hotel";
    private static final String username = "root";
    private static final String password = "";

    static {
        try {
            connection = DriverManager.getConnection(url,username,password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    public static Connection getConnection() {
        return connection;
    }
}