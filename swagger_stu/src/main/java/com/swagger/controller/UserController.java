package com.swagger.controller;

import com.swagger.pojo.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author lixiang
 * @date 2020-04-07-23:28
 */
@Api(value = "用户模块", description = "用户模块的接口信息 ")
@RestController
public class UserController {
    public static ArrayList<User> users = new ArrayList<User>();

    static {
        users.add(new User("张三", "123456"));
        users.add(new User("李四", "1234"));
    }

    @ApiOperation(value = "获取用户列表", notes = "获取所有用户的列表 ")
    @GetMapping("/users")
    public Object users() {
        HashMap<String, Object> map = new HashMap<>();
        map.put("users", users);
        return map;
    }


}
