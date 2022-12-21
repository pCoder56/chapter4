package Students.insert;

import DBConnection.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert {

    private DBConnection dbConnection = new DBConnection();

    public void insert() throws SQLException {
        String query = " INSERT INTO students( name, age, batch ) values (?,?,?)";
        Connection connection = dbConnection.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, "Pooja");
        preparedStatement.setInt(2,22);
        preparedStatement.setInt(3, 2075);
        preparedStatement.execute();
    }

    public static void main(String[] args) {
        Insert insertToDB = new Insert();
        try{
            insertToDB.insert();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
