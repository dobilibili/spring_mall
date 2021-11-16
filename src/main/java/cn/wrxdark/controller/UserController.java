package cn.wrxdark.controller;

import cn.wrxdark.entity.User;
import cn.wrxdark.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/getUsers")
    public List<User> users(int offset, int maxResults) {
        return userService.getUsers(offset, maxResults);
    }

    @GetMapping("/getUser/{id}")
    public User user(@PathVariable("id") long id) {
        System.out.println(userService.getUserById(id));
        return userService.getUserById(id);
    }
}