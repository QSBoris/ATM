package bank.management.system;

import java.sql.*;

public class DB {

    Connection connection;

    Statement statement;

    public DB() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:127/bankSystem", "root", "pass123");
            statement = connection.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}