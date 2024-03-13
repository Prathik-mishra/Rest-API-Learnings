package com.acciojob.FirstRESTAPI;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashMap;
import java.util.List;

@Repository
public class RepositoryLayer {

    HashMap<Integer,User> userDb = new HashMap<>();

    public String addUserToDb(User user){
        int dbKey = user.getUserId();
        userDb.put(dbKey,user);

        return "User has been added to DB";
    }

    public User getFromDb(int userId){
        return userDb.get(userId);
    }

    public List<User> getAllUsers(){

        // We need a list of user Objects that are present in the Hashmap

        List<User> userList = new ArrayList<>();
        for(User user: userDb.values()){
            userList.add(user);
        }
        return userList;
    }
 }
