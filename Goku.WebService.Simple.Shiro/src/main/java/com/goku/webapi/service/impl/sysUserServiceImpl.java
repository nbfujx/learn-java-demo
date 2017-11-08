package com.goku.webapi.service.impl;


import com.goku.webapi.mapper.ext.sysUserExtMapper;
import com.goku.webapi.mapper.sysUserMapper;
import com.goku.webapi.model.sysUser;
import com.goku.webapi.service.sysUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import java.util.List;
import java.util.Map;


/**
 * Created by nbfujx on 2017/10/14.
 */
@Component
public class sysUserServiceImpl implements sysUserService {

    private Logger logger = LoggerFactory.getLogger(sysUserServiceImpl.class);

    @Autowired
    private sysUserExtMapper sysuserextmapper;

    @Override
    public sysUser selectByid(String id) {
        this.logger.info("selectByid");
        return sysuserextmapper.selectByPrimaryKey(id);
    }


}
