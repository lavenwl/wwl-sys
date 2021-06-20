package com.wwl.sys.user.controller;

import com.wwl.sys.user.domain.entity.User;
import com.wwl.sys.user.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author WangWenlong 2021/6/18
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    UserService userService;

    @GetMapping("/{id}")
    public User getUserById(@PathVariable int id) {
        System.out.println("123");
        return userService.getUserById(id);
    }
}
