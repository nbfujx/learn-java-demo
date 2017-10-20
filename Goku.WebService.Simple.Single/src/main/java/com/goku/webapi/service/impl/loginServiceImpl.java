package com.goku.webapi.service.impl;



import com.goku.webapi.mapper.ext.sysUserExtMapper;
import com.goku.webapi.model.sysUser;
import com.goku.webapi.service.loginService;
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
