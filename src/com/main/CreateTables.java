package com.main;

import com.tables.*;

/**
 * Created by rafsan.jani on 10/6/15.
 */
public class CreateTables implements AccountInfo, FriendList, Profile, MessageQueue, Timeline {

    @Override
    public void createAccountTable() {

    }

    @Override
    public void createFriendListTable() {

    }

    @Override
    public boolean isFriend(int firstUser, int secondUser) {
        return false;
    }

    @Override
    public void createMessageQueueTable() {

    }

    @Override
    public void createTimelineTable() {

    }

    @Override
    public void createProfileTable() {

    }
}
