package com.tables;

/**
 * Created by rafsan.jani on 10/6/15.
 */
public interface FriendList {
    /*
        * Table Columns
        * firstUser
        * secondUser
        * status
        * */
    void createFriendListTable();
    boolean isFriend(int firstUser,int secondUser);
}
