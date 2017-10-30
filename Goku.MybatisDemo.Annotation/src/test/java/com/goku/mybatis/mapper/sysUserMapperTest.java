package com.goku.mybatis.mapper;

import com.alibaba.fastjson.JSON;
import com.goku.mybatis.WebapiApplication;
import com.goku.mybatis.model.sysUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import test.com.goku.mybatis.service.impl.sysUserServiceImplTest;

import static org.junit.Assert.*;

/**
 * Created by nbfujx on 2017/10/30.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = WebapiApplication.class)
public class sysUserMapperTest  {


    private Logger logger = LoggerFactory.getLogger(sysUserMapperTest.class);

    @Autowired
    sysUserMapper sysusermapper;

    @Test
    public void findsysUser() throws Exception {
         this.logger.info("info"+JSON.toJSONString (sysusermapper.findsysUser("ceb2041eb7cb11e7ae124ccc6a7854f5")));
    }

    @Test
    public void findsysOrg() throws Exception {
        this.logger.info("info"+JSON.toJSONString (sysusermapper.findsysOrg("1")));
    }

    @Test
    public void insertUser() throws Exception {
         sysUser sysuser=new sysUser();
        sysuser.setId("1111");
        sysuser.setName("2222");
        sysusermapper.insertUser(sysuser);

    }

    @Test
    public void updateUser() throws Exception {
        sysUser sysuser=sysusermapper.findById("1111");
        sysuser.setId("1111");
        sysuser.setName("44444");
        sysusermapper.updateUser(sysuser);

    }

    @Test
    public void deleteUser() throws Exception {
        sysusermapper.deleteUser("1111");

    }

}