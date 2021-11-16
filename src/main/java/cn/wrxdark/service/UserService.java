package cn.wrxdark.service;

import cn.wrxdark.entity.User;

import java.util.List;

public interface UserService {
    User login(String email, String password);
    User register(String email, String password, String name);

    User getUserById(long id);

    List<User> getUsers(int offset,int maxResults);
}
