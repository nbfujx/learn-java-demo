package com.goku.mybatis.service.impl;



import com.goku.mybatis.mapper.ext.sysUserExtMapper;
import com.goku.mybatis.model.sysUser;
import com.goku.mybatis.service.loginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by nbfujx on 2017/10/15.
 */
@Component
public class loginServiceImpl implements loginService {

    @Autowired
    private sysUserExtMapper sysUserExtMapper;

    @Override
    public boolean validUser(String username, String password, String orgid) {
        sysUser sysUser=sysUserExtMapper.validUser(username,password,orgid);
        if(sysUser==null)
        {
            return  false;
        }else
        {
            return true;
        }
    }


}
