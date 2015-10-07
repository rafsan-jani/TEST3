package com.queries;

import com.main.PersonalInfo;
import com.main.User;

/**
 * Created by rafsan.jani on 10/7/15.
 */
public interface Queries {
    /*
    * Account Table
    * */
    boolean isUsedEmail(String email);
    User loginSuccessful(String email,int userId);
    boolean insertIntoAccount(String email,String password);

    /*
    * Profile Table
    * */
    boolean insertIntoProfile(PersonalInfo personalInfo);
    boolean updateProfile(PersonalInfo personalInfo);
    /*
    * Timeline Table
    * */

    /*
    * Message Table
    * */
}
