package com.stylefeng.guns.rest.modular.user.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.stylefeng.guns.rest.user.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version 1.0
 * @ClassName UserController
 * @Description todo
 * @Author wangdi
 * @Date 2019/10/12 17:22
 **/

@RestController
public class UserController {
    @Reference(interfaceClass = UserService.class)
    private UserService userService;

    @RequestMapping("hellowangdi")
    public String getUsernameById(Integer id){
        String username = userService.getNameById(id);

        return username;

    }
}
