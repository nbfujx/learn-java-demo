package com.goku.webapi.service.impl;

import com.goku.webapi.mapper.ext.sysMenuExtMapper;
import com.goku.webapi.mapper.sysMenuMapper;
import com.goku.webapi.model.sysMenu;
import com.goku.webapi.service.sysMenuService;
import com.goku.webapi.service.sysUserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.security.PrivateKey;

/**
 * Created by nbfujx on 2017/11/7.
 */
@Component
public class sysMenuServiceImpl implements sysMenuService {


    @Autowired
    private sysMenuExtMapper sysmenumapper;

    @Override
    public sysMenu selectByid(Long id) {
        return  sysmenumapper.selectByPrimaryKey(id);
    }
}
