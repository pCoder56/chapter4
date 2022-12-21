package Students;

import DBConnection.DBConnection;

import java.sql.Connection;
import java.sql.Statement;


public class CreateTable {

    private DBConnection dbConnection = new DBConnection();

    public boolean createTables() {

        String query = " CREATE TABLE IF NOT EXISTS students " +
                "(id INTEGER NOT NULL AUTO_INCREMENT, " +
                "name VARCHAR(255) ," +
                "age INTEGER, " +
                "batch INTEGER, " +
                "PRIMARY KEY (id))";
        try {
            Statement statement = dbConnection.getConnection().createStatement();
            statement.execute(query);
            return true;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static void main(String[] args) {
        CreateTable createTables = new CreateTable();
        System.out.println(createTables.createTables());
    }
}