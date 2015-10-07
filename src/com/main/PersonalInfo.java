package com.main;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by rafsan.jani on 10/7/15.
 */
public class PersonalInfo {
    private String firstName;
    private String lastName;
    private String sex;
    private int age;
    private Date dateOfBirth;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    private int calculateAge(Date dateOfBirth) {
        Calendar birthDay = Calendar.getInstance();
        Calendar today = Calendar.getInstance();
        birthDay.setTime(dateOfBirth);
        int age = today.get(Calendar.YEAR) - birthDay.get(Calendar.YEAR);
        if (birthDay.get(Calendar.MONTH) > today.get(Calendar.MONTH)) {
            age--;
        } else if (birthDay.get(Calendar.MONTH) == today.get(Calendar.MONTH)
                && birthDay.get(Calendar.DAY_OF_MONTH) > today.get(Calendar.DAY_OF_MONTH)) {
            age--;
        }
        return age;
    }

    public PersonalInfo(String firstName, String lastName, String sex, Date dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.dateOfBirth = dateOfBirth;
        this.age = calculateAge(dateOfBirth);
    }

}
