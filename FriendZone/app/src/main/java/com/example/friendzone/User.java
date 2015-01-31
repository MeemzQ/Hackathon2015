package com.example.friendzone;

/**
 * Created by Wenting Pan on 2015-01-31.
 */
public class User {
    private String first_name;
    private String last_name;
    private int phone_number;

    public User(String first, String last, int number) {
        first_name = first;
        last_name = last;
        phone_number = number;
    }

    //Need status (in database or not) and get gps location
}
