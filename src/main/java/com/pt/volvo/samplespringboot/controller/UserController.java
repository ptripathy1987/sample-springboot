package com.pt.volvo.samplespringboot.controller;

import com.pt.volvo.samplespringboot.dto.User;
import com.pt.volvo.samplespringboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(path= "/getUsers", method = RequestMethod.GET)
    public List<User> getAllUsers() {
        return userService.getUserList();
    }
}
