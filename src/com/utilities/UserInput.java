package com.utilities;

import com.main.PersonalInfo;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by rafsan.jani on 10/7/15.
 */
public class UserInput {
    private static final UserInput userInput = new UserInput();

    public static UserInput getInstance() {
        return userInput;
    }

    private Scanner scanner;

    private UserInput() {
        scanner = new Scanner(System.in);
    }

    public String inputString() {
        String string;
        string = scanner.nextLine();
        return string;
    }
    public  int inputInteger(){
        int integer;
        integer=scanner.nextInt();
        return integer;
    }
    public String getEmail() {
        System.out.print("Enter email: ");
        return inputString();
    }

    public String getPassword(int attempt) {
        if (attempt == 0) System.out.print("Enter password: ");
        else if (attempt == 1) System.out.print("Confirm password: ");
        return inputString();
    }

    private String inputFirstName() {
        System.out.print("First Name: ");
        return inputString();
    }

    private String inputLastName() {
        System.out.print("Last Name: ");
        return inputString();
    }
    private  String inputSex(){
        System.out.print("Sex: ");
        return inputString();
    }
    public Date inputDate(){
        int day;
        int month;
        int year;
        System.out.println("Date of Birth(dd\\mm\\year)");
        System.out.print("Day(1-31): ");
        day=inputInteger();
        System.out.print("Month(1-12): ");
        month=inputInteger();
        System.out.print("Year: ");
        year=inputInteger();
        Calendar calendar=Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_MONTH,day);
        calendar.set(calendar.MONTH,month-1);
        calendar.set(calendar.YEAR,year);
        Date date=calendar.getTime();
        return date;
    }
    public PersonalInfo getPersonalInfo() {
        String firstName = inputFirstName();
        String lastName = inputLastName();
        String sex=inputSex();
        Date dateOfBirth=inputDate();
        return  new PersonalInfo(firstName,lastName,sex,dateOfBirth);
    }
}
