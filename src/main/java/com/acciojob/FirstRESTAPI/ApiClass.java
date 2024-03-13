package com.acciojob.FirstRESTAPI;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController //This tells spring application that this class is having APIs written
public class ApiClass {

    //Create a hashmap that will act Like a Database:

    HashMap<Integer,User> userDb = new HashMap<>();

    @GetMapping("/getWeatherUpdate")
    public String getWeatherUpdate(){

        return "The weather is good, The winds are at 10KmpH and blah blah blah";
    }

    @GetMapping("/addUser")
    public String addUser(@RequestParam("userId")int userId,
                          @RequestParam("age")int age,
                          @RequestParam("name")String name){

        //TO add this imfo to the db:
        User userObj = new User(name,age,userId);

        int dbKey = userId;

        userDb.put(dbKey,userObj);

        return "User has been added to the DB";
    }

    @GetMapping("/getUserInfo")
    public User getUser(@RequestParam("userId")int userId){
        User user = userDb.get(userId);
        return user;
    }

    @PostMapping("/addUserViaBody")
    public String addUserViaReqBody(@RequestBody User userObj){

        int dbKey = userObj.getUserId();
        userDb.put(dbKey,userObj);
        return "User has been added to the DB";
    }
}
/*
 4 Types of API:
 *  GET --> getting @requestParam @RequestBody
 *  POST --> save
 *  PUT --> update
 *  DELETE --> delete
 */