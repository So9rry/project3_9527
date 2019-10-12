package com.stylefeng.guns.rest.modular.user;

import com.alibaba.dubbo.config.annotation.Service;
import com.stylefeng.guns.rest.persistence.dao.UserMapper;
import com.stylefeng.guns.rest.persistence.model.User;
import com.stylefeng.guns.rest.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @version 1.0
 * @ClassName UserServiceImpl
 * @Description todo
 * @Author wangdi
 * @Date 2019/10/12 17:07
 **/

@Component
@Service(interfaceClass = UserService.class)
public class UserServiceImpl implements UserService {


    @Autowired
    private UserMapper userMapper;

    @Override
    public String getNameById(Integer id) {
        User user = userMapper.selectById(id);
        String userName = user.getUserName();
        return userName;
    }
}
