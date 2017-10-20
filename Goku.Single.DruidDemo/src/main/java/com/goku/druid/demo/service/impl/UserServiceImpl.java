package com.goku.druid.demo.service.impl;

import com.goku.druid.demo.mapper.UserMapper;
import com.goku.druid.demo.model.UserWithBLOBs;
import com.goku.druid.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by nbfujx on 2017-10-18.
 */
@Component
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public UserWithBLOBs selectByPrimaryKey(String id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
