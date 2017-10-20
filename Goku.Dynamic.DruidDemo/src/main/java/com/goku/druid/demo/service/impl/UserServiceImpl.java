package com.goku.druid.demo.service.impl;

import com.goku.druid.demo.mapper.FormElementMapper;
import com.goku.druid.demo.mapper.UserMapper;
import com.goku.druid.demo.model.FormElement;
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

    @Autowired
    FormElementMapper formElementMapper;

    @Override
    public UserWithBLOBs selectByPrimaryKey(String id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public FormElement selectByPrimaryKey2(Integer id) {
        return formElementMapper.selectByPrimaryKey(id);
    }
}
