package com.example.friendzone;

/**
 * Created by Wenting Pan on 2015-01-31.
 */
public class FriendList {
    private Friend[] friend_list  = new Friend[];

    public void addFriend(Friend friend) {
        this.friend_list.append(friend);
    }
}
