package com.yuetaowang.pindd.service.impl;

import com.yuetaowang.pindd.bean.Result;
import com.yuetaowang.pindd.bean.User;
import com.yuetaowang.pindd.dao.UserDao;
import com.yuetaowang.pindd.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource(name="UserDao")
    UserDao userDao;
    @Override
    public void addUser(User user) {

    }

    @Override
    public List<User> findAllUser() {
        List<User> users = userDao.list();
        return users;
    }

    @Override
    public void updateUser(User user) {
    }

    @Override
    public void delUserById(String id) {
    }

    @Override
    public User findUserByName(String name) {
        Result result = new Result();
        User user = userDao.queryByName(name);
        return user;
    }

}
