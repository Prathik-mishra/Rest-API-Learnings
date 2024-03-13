package com.acciojob.FirstRESTAPI;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ControllerLayer {

    ServiceLayer serviceObj = new ServiceLayer();

    @PostMapping("/addToDb")
    public String addToDb(@RequestBody User user){

        String result = serviceObj.addUserToDb(user);
        return result;
    }

    @GetMapping("/getFromDb")
    public User getFromDb(@RequestParam("UserId")Integer userId){

        User userObj = serviceObj.getFromDb(userId);
        return userObj;
    }

    @GetMapping("/getNameWithYoungestAge")
    public String getNameOfPreson(){

    }
}
