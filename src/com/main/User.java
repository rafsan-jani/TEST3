package com.main;

import com.utilities.UserInput;

/**
 * Created by rafsan.jani on 10/6/15.
 */
public class User {
    private int userId;
    private String email;
    private String password;
    private PersonalInfo personalInfo;
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public PersonalInfo getPersonalInfo() {
        return personalInfo;
    }

    public void setPersonalInfo(PersonalInfo personalInfo) {
        this.personalInfo = personalInfo;
    }
    public void updatePersonalInfo() {
        this.personalInfo = UserInput.getInstance().getPersonalInfo();
    }

    public User() {
    }
    public User(String email, String password) {
        this.email=email;
        this.password=password;
        this.personalInfo=null;
    }

    public void register() {

    }
}
