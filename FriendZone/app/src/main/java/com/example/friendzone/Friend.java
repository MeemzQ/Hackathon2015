package com.example.friendzone;

/**
 * Created by Wenting Pan on 2015-01-31.
 */
public class Friend {
    private String first_name;
    private String last_name;
    private String name;
    private int phone_number;

    public Friend(String first, String last, int number) {
        this.first_name = first;
        this.last_name = last;
        this.name = first + " " +  last;
        this.phone_number = number;

    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(int phone_number) {
        this.phone_number = phone_number;
    }

/*    public int compareTo(Object obj) {
        if (((Friend) obj).getName() == this.getName())
            return 0;
        else if (((Friend) obj).getName() > this.getName())
            return -1;
        else
            return 1;
    }*/

    //Need status (in database or not) and get gps location
}
