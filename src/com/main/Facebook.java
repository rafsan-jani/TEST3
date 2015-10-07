package com.main;

import com.queries.Queries;
import com.utilities.EmailValidator;
import com.utilities.UserInput;
import com.utilities.UserInterface;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

/**
 * Created by rafsan.jani on 10/6/15.
 */
public class Facebook {
    void login() {
        String email;
        String password;
        int userId = -1;
        int loginAttempt = 0;
        while (loginAttempt < 3) {
            if (loginAttempt != 0) {
                System.out.println("Try again...");
            }
            email = UserInput.getInstance().getEmail();
            password = UserInput.getInstance().getPassword(0);
//            userId =
            loginAttempt++;
        }
    }

    void register() {
        String email;
        String password;
        String tempPassword;
        PersonalInfo personalInfo;
        QueriesImplementation queriesImplementation = new QueriesImplementation();
        email = UserInput.getInstance().getEmail();
        if (EmailValidator.getInstance().validate(email)) {
            if (queriesImplementation.isUsedEmail(email) == false) {
                password = UserInput.getInstance().getPassword(0);
                tempPassword = UserInput.getInstance().getPassword(1);
                if (password.equals(tempPassword)) {
                    User user = new User(email, password);
                    user.updatePersonalInfo();
                    user.register();
                    queriesImplementation.addNewUser(user);
                } else {
                    System.out.println("ERROR!!! Password not matched...");
                }
            } else {
                System.out.println("ERROR!!! Email already used...");
            }

        } else {
            System.out.println("ERROR!!! Invalid email...");
        }
    }

    public void run() {
        UserInterface.getInstance().showHeader();
        int option = 0;
        do {
            UserInterface.getInstance().showStartMenu();
            option = UserInput.getInstance().inputInteger();
            switch (option) {
                case 1:
                    /*
                    * Login
                    * */
                    login();
                    break;
                case 2:
                    /*
                    * Register
                    * */
                    register();
                    break;
                case 3:
                    System.out.println("\t\t\t***Thank You***\t\t\t");
                    break;
                default:
                    System.out.println("Please try again...");
                    break;
            }

        } while (option != 3);
    }
}
