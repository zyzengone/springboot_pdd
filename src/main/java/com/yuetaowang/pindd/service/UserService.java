package com.yuetaowang.pindd.service;

import com.yuetaowang.pindd.bean.Result;
import com.yuetaowang.pindd.bean.User;

import java.util.List;

public interface UserService {
    public void addUser(User user);

    public List<User> findAllUser();

    public void updateUser(User user);

    public void delUserById(String id);

    public User findUserByName(String name);
}
