package DBConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConnection {

    public static void main(String[] args) {
        try{
            DBConnection dbConnection = new DBConnection();
            dbConnection.getConnection();

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }


}
