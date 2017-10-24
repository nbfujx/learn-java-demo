package com.goku.mybatis.service.impl;

import com.goku.mybatis.mapper.sysUserMapper;
import com.goku.mybatis.model.sysUser;
import com.goku.mybatis.service.sysUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


/**
 * Created by nbfujx on 2017/10/14.
 */
@Component
public class sysUserServiceImpl implements sysUserService {

    private Logger logger = LoggerFactory.getLogger(sysUserServiceImpl.class);

    @Autowired
    sysUserMapper sysusermapper;

    @Override
    public sysUser fndByUsername(String username) {
        return sysusermapper.findByUsername(username);
    }
}
