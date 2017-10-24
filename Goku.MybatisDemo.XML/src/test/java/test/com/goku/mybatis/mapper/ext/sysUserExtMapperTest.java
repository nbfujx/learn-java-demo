package test.com.goku.mybatis.mapper.ext;

import com.goku.mybatis.WebapiApplication;
import com.goku.mybatis.mapper.ext.sysUserExtMapper;
import com.goku.mybatis.model.sysUser;
import com.goku.mybatis.model.sysUserInfo;
import com.goku.mybatis.service.impl.sysUserServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by nbfujx on 2017/10/23.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = WebapiApplication.class)
public class sysUserExtMapperTest  {



    private Logger logger = LoggerFactory.getLogger(sysUserExtMapperTest.class);

    @Autowired
    private sysUserExtMapper sysuserextmapper;

    @Test
    public void insertsysUser() throws Exception {
       sysUser sysuser=new sysUser();
        sysuser.setId("222");
        sysuser.setOrgId("2");
        int i=sysuserextmapper.insertsysUser(sysuser);
        this.logger.info("执行成功个数："+i);
    }

    @Test
    public void insertsysUser2() throws Exception {
        sysUser sysuser=new sysUser();
        sysuser.setOrgId("2");
        int i=sysuserextmapper.insertsysUser2(sysuser);
        this.logger.info("执行成功个数："+i);
    }

    @Test
    public void insertsysUser3() throws Exception {
        sysUser sysuser=new sysUser();
        sysuser.setOrgId("2");
        int i=sysuserextmapper.insertsysUser3(sysuser);
        this.logger.info("执行成功个数："+i);
    }

    @Test
    public void updateUser() throws Exception {
        sysUser sysuser=sysuserextmapper.selectByUsername("1");
        sysuser.setPassword("3");
        sysuser.setOrgId("2");
        int i=sysuserextmapper.updateUser(sysuser);
        this.logger.info("执行成功个数："+i);
    }

    @Test
    public void deleteByUserName() throws Exception {
        int i=sysuserextmapper.deleteByUserName("1");
        this.logger.info("执行成功个数："+i);
    }

    @Test
    public void selectByUsername() throws Exception {
        sysUser user= sysuserextmapper.selectByUsername("444");
        this.logger.info("执行成功个数："+user.getUsername()+":"+user.getId());
    }

    @Test
    public void selectByUsernameORorg() throws Exception {

    }

    @Test
    public void selectByUsernameORorg2() throws Exception {

    }

    @Test
    public void selectUserByOrgid2() throws Exception {
        List org_ids = new ArrayList();
        org_ids.add(1);
        org_ids.add(3);
        org_ids.add(6);
        List<Map<String, String>> users=sysuserextmapper.selectUserByOrgid2(org_ids);
    }

    @Test
    public void selectByUsername2() throws Exception {
        List<sysUser> user= sysuserextmapper.selectByUsername2("2");
    }

    @Test
    public void selectextends() throws Exception {
        sysUser user= sysuserextmapper.selectextends("444");
        this.logger.info("执行成功个数："+user.getUsername()+":"+user.getSysuserinfo().getAddress());
    }


    @Test
    public void selectextends2() throws Exception {
        sysUser user= sysuserextmapper.selectextends2("444");
        this.logger.info("执行成功个数："+user.getUsername()+":"+user.getSysuserinfo().getAddress());
    }

    @Test
    public void selectextends3() throws Exception {
        Map<String, String> user= sysuserextmapper.selectextends3("444");
        this.logger.info("执行成功个数："+user);
    }

    @Test
    public void selectextends4() throws Exception {
        sysUser user= sysuserextmapper.selectextends4("444");
        this.logger.info("执行成功个数："+user.getUsername()+":"+user.getSysuserinfo().getAddress());
    }

    @Test
    public void selectextends5() throws Exception {
        sysUser user= sysuserextmapper.selectextends5("444");
        this.logger.info("执行成功个数："+user.getUsername()+":"+user.getSysuserinfo().getAddress());
    }

    @Test
    public void selectextends6() throws Exception {
        sysUser user= sysuserextmapper.selectextends6("444");
        this.logger.info("执行成功个数："+user.getUsername()+":"+user.getSysuserinfo().getAddress());
    }
}