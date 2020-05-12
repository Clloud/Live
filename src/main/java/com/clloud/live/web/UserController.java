package com.clloud.live.web;

import com.clloud.live.entity.User;
import com.clloud.live.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value="/all", method = RequestMethod.GET)
    private Map<String, Object> getUsers() {
        Map<String, Object> map = new HashMap<>();
        List<User> users = userService.getUsers();
        map.put("users", users);
        return map;
    }
}
