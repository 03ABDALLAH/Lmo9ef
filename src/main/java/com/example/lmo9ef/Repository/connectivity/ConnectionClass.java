package com.example.lmo9ef.Repository.connectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionClass {

    public Connection connection;
    public Connection getConnection()
    {
        String dbName ="u139820734_db1";
        String username = "u139820734_user1";
        String password = "zR9>5Wa59IP";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://185.166.188.206:3306/" + dbName + "?useSSL=false",username,password);

        } catch (SQLException e) {
            throw new RuntimeException("Cannot connect to database", e);
        }
        catch(ClassNotFoundException e) {
            System.out.println("null");
        }
        return connection;
    }

}
