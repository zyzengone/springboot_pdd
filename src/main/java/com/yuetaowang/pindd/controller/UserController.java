package com.yuetaowang.pindd.controller;

import com.yuetaowang.pindd.bean.Result;
import com.yuetaowang.pindd.bean.User;
import com.yuetaowang.pindd.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    //通过resource自动引入业务层，注意引入的是UserService的接口，controller层并不关心service的具体实现
    @Resource
    private UserService service;

    /**
     * 查询
     *
     * @return Result封装后的返回json
     */
    @GetMapping("/list")
    public Result findAllStudent() {
        List<User> users = service.findAllUser();
        return Result.create(users);
    }

    /**
     * 通过？参数查询
     * @param name 获取到的?name=xx请求参数
     * @return Result封装后的返回json
     */
    @GetMapping("/search")
    public Result findUserByName(@RequestParam(name="name") String name){
        User user = service.findUserByName(name);
        return Result.create(user);
    }

    @GetMapping("/exception")
    public Result testGlobalException(@RequestParam(name="name") String name){
        User user = service.findUserByName(name);
        Integer.parseInt("abc123");
        return Result.create(user);
    }
}
