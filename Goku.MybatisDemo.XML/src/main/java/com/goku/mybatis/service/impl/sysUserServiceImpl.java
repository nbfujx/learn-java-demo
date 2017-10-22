package com.goku.mybatis.service.impl;


import com.goku.mybatis.mapper.ext.sysUserExtMapper;
import com.goku.mybatis.mapper.sysUserMapper;
import com.goku.mybatis.model.sysUser;
import com.goku.mybatis.service.sysUserService;
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
    private sysUserMapper sysusermapper;

    @Autowired
    private sysUserExtMapper sysuserextmapper;


    @Override
    public sysUser selectByUsername(String username) {
        return sysuserextmapper.selectByUsername(username);
    }

    @Override
    public sysUser selectByid(String id) {
        this.logger.info("selectByid");
        return sysusermapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Map<String, String>> selectUserByOrgid(String orgid,String orderSort,String orderFiled) {
        List<Map<String, String>> users= sysuserextmapper.selectUserByOrgid(orgid,orderSort,orderFiled);
        return users;
    }

    @Override
    public Map<String, String> selectUserByUsername(String username) {
        return sysuserextmapper.selectUserByUsername(username);
    }

}
