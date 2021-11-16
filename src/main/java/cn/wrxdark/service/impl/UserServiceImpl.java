package cn.wrxdark.service.impl;

import cn.wrxdark.entity.User;
import cn.wrxdark.mapper.UserMapper;
import cn.wrxdark.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {

    private final UserMapper userMapper;

    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }


    public User login(String email, String password) {
        return null;
    }

    public User register(String email, String password, String nickname) {
        User user = new User(email, password, nickname, new Date(System.currentTimeMillis()));
        userMapper.insert(user);
        return user;
    }

    @Override
    public User getUserById(long id) {
        return userMapper.getById(id);
    }

    @Override
    public List<User> getUsers(int offset, int maxResults) {
        return userMapper.getAll(offset, maxResults);
    }
}
