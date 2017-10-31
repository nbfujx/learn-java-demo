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

import java.util.ArrayList;
import java.util.List;

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
    public void findUserByIdSql() throws Exception {
        this.logger.info("info"+JSON.toJSONString (sysusermapper.findUserinfoByIdSql("ceb2041eb7cb11e7ae124ccc6a7854f5")));
    }

    @Test
    public void findUserByIdSql2() throws Exception {
        this.logger.info("info"+JSON.toJSONString (sysusermapper.findUserByIdSql2("ceb2041eb7cb11e7ae124ccc6a7854f5","444")));
    }

    @Test
    public void insertUser() throws Exception {
         sysUser sysuser=new sysUser();
        sysuser.setId("111551333322");
        sysuser.setName("22223333");
        sysusermapper.insertUser5(sysuser);

    }

    @Test
    public void updateUser() throws Exception {
        sysUser sysuser=sysusermapper.findById("111551");
        sysuser.setId("111551");
        sysuser.setName("44444");
        sysusermapper.updateUser2(sysuser);

    }

    @Test
    public void deleteUser() throws Exception {
        sysusermapper.deleteUser2("111551");

    }


    @Test
    public void findsysUserbyvelocity() throws Exception {
        this.logger.info("info"+JSON.toJSONString (sysusermapper.findsysUserbyvelocity("2")));
    }

    @Test
    public void findsysUserbyvelocity2() throws Exception {
        this.logger.info("info"+JSON.toJSONString (sysusermapper.findsysUserbyvelocity2("2")));
    }

    @Test
    public void findsysUserbyvelocity3() throws Exception {
        this.logger.info("info"+JSON.toJSONString (sysusermapper.findsysUserbyvelocity3("2")));
    }

    @Test
    public void updateUser3() throws Exception {
        sysUser sysuser=sysusermapper.findById("222");
        sysuser.setId("222");
        sysuser.setName("3333455666");
        sysusermapper.updateUser3(sysuser);

    }

    @Test
    public void findsysUserbyvelocity4() throws Exception {
        List<String> ids=new ArrayList();
        ids.add("2");
        ids.add("222");
        this.logger.info("info"+JSON.toJSONString (sysusermapper.findsysUserbyvelocity5(ids)));
    }

}