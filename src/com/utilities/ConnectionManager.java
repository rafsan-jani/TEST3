package com.utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by rafsan.jani on 10/6/15.
 */
public class ConnectionManager {
    public static Connection getConnection(){
        Connection connection=null;
        try{
            connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/facebook", "root", "teto");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
