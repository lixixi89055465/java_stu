package com.swagger.controller;

import com.swagger.pojo.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

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

    @ApiOperation(value = "获取单个用户", notes = "根据ID 查询某个用户")
    @ApiImplicitParam(value = "用户的ID", paramType = "path", dataType = "int")
    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable("id") int id) {
        return users.get(id);
    }

    @ApiOperation(value = "添加用户", notes = "根据传入的用户信息添加用户")
    @ApiImplicitParam(value = "用户对象", paramType = "query")
    @PostMapping("/user")
    public Object add(@RequestBody User user) {
        return users.add(user);
    }

    @ApiOperation(value = "删除用户",notes = "根据用户传入的用户ID删除对应的用户 ")
    @ApiImplicitParam(value = "用户的ID",paramType = "path")
    @DeleteMapping("/user/{id}")
    public Object delete(@PathVariable("id")int id){
        return users.remove(id);
    }
}
