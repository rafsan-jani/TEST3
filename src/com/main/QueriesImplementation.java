package com.main;

import com.queries.Queries;
import com.utilities.ConnectionManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by rafsan.jani on 10/7/15.
 */
public class QueriesImplementation implements Queries {
    @Override
    public boolean isUsedEmail(String email) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = ConnectionManager.getConnection();
            preparedStatement = connection.prepareStatement("SELECT * FROM account WHERE email=?");
            preparedStatement.setString(1, email);
            preparedStatement.execute();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return false;
    }

    @Override
    public User loginSuccessful(String email, int userId) {
        return null;
    }

    @Override
    public boolean insertIntoAccount(String email, String password) {
        return false;
    }

    @Override
    public boolean insertIntoProfile(PersonalInfo personalInfo) {

        return false;
    }

    @Override
    public boolean updateProfile(PersonalInfo personalInfo) {
        return false;
    }

    public boolean addNewUser(User user){
        boolean success=true;
        success=success & insertIntoAccount(user.getEmail(),user.getPassword());
        success=success & insertIntoProfile(user.getPersonalInfo());
        if(success){
            System.out.println("Registration Successful...");
        }
        return success;
    }
}
