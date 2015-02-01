package com.example.friendzone;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.util.Collections.*;

/**
 * Created by Wenting Pan on 2015-01-31.
 */
public class FriendList {

    private ArrayList<Friend> friend_list;
    private ArrayList<Friend> favourite_list;
    private ArrayList<Friend> sort_friends;

    public FriendList(){
        this.friend_list = new ArrayList<Friend>();
    }

    public void addFriend(Friend friend) { // When we add we need to create
        this.friend_list.add(friend);
    }


    public void removeFriend(Friend friend){
        this.friend_list.remove(friend);
    }

    public ArrayList<Friend> getFriend_list() {
        return friend_list;
    }

    public void setFriend_list(ArrayList<Friend> friend_list) {
        this.friend_list = friend_list;
    }

    public ArrayList<Friend> getFavourite_list() {
        return favourite_list;
    }

    public void setFavourite_list(ArrayList<Friend> favourite_list) {
        this.favourite_list = favourite_list;
    }

    public ArrayList<Friend> getSort_friends() {
        return sort_friends;
    }

    public void setSort_friends(ArrayList<Friend> friends_list) {
        this.sort_friends = friends_list;
    }

    public List<String> sorter(ArrayList<Friend> friends){
        ArrayList<String> lista = new ArrayList<String>();
        for(Friend f: friends){
            lista.add(f.getName());
        }
        List<String> sublist = lista.subList(0, lista.size());
        Collections.sort(sublist);
        return sublist;
    }
    public ArrayList<Friend> fullsort(ArrayList<Friend> lista){
        List<String> names = sorter(lista);
        ArrayList<Friend> finals = new ArrayList<Friend>();
        for(String s: names){
            for(Friend f: lista){
                if (s.equals(f.getName())){
                    finals.add(f);
                    break;
                }
            }
        }
        return finals;
    }






/*    public ArrayList<Friend> sortList(ArrayList<Friend> part_list){
        return sort(part_list);
    }*/

    public ArrayList<Friend> arranged() {
        for (Friend f : this.favourite_list) {
            this.sort_friends.add(f);
        }
        for (Friend f : this.friend_list) {
            this.sort_friends.add(f);
        }

        return this.sort_friends;
    }

}
