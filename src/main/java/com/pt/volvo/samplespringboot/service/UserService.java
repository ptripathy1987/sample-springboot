package com.pt.volvo.samplespringboot.service;

import com.pt.volvo.samplespringboot.dto.User;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    List<User> userList = new ArrayList<>();

    @PostConstruct
    public void init() {
        userList.add(new User("pt","x","admin"));
        userList.add(new User("pt1","v1","admin1"));
    }

    public List<User> getUserList() {
        return userList;
    }

    public boolean login(String name, String password) {
        return userList.stream().filter(user -> name.equals(user.getUserName()) && password.equals(user.getPassword()))
                .findAny().isPresent();
    }

}
