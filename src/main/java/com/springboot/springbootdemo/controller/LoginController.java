package com.springboot.springbootdemo.controller;
import com.springboot.springbootdemo.api.CommonResult;
import com.springboot.springbootdemo.bean.User;
import com.springboot.springbootdemo.service.UserService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    private UserService userService;

    @RequestMapping(value = "/admin/login", method = RequestMethod.POST)
    public CommonResult login(@RequestBody User user) {
        // 便于测试
        if (user.getUsername().equals("admin") && user.getPassword().equals("123456"))
            return CommonResult.success("admin");
        else
            return CommonResult.validateFailed("用户名不存在或密码错误");

//        if(userService.findUserByName(user.getUsername()) == null)
//            return CommonResult.validateFailed("用户名不存在或密码错误");
//        else if(userService.findUserByName(user.getUsername()).getPassword().equals(user.getPassword()))
//            return CommonResult.success(userService.findUserByName(user.getUsername()));
//        else
//            return CommonResult.validateFailed("用户名不存在或密码错误");
    }
}
