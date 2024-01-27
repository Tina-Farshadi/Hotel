package Services;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import Models.Guest;
import Models.HashTHePass;
public class GeustServices {
    private Connection connection;
    public GeustServices(Connection connection) {
        this.connection = connection;
    }
    public boolean Add(String Name,String LastName, String email,String id,String pass) {
        Guest guest=new Guest(Name,LastName, email,id,pass);

        try {
            String sql = "INSERT INTO guest ('name', 'lastname', 'email', 'id', 'password') VALUES (?, ?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, guest.getName());
            statement.setString(2, guest.getLastName());
            statement.setString(3, guest.getEmail());
            statement.setString(4, guest.getId());
            statement.setString(5, HashTHePass.getSHA(guest.getPassword()));
            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

//    public boolean Check(){
//        try {
//            String sql="SELECT * FROM guest";
//
//        }
//    }
}
