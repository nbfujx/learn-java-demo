package test.com.goku.mybatis.service.impl;

import com.alibaba.fastjson.JSON;
import com.goku.mybatis.WebapiApplication;
import com.goku.mybatis.mapper.sysUserMapper;
import com.goku.mybatis.service.impl.sysUserServiceImpl;
import com.goku.mybatis.service.sysUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by nbfujx on 2017/10/24.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = WebapiApplication.class)
public class sysUserServiceImplTest {

    private Logger logger = LoggerFactory.getLogger(sysUserServiceImplTest.class);

    @Autowired
    sysUserService sysuserService;

    @Test
    public void fndByUsername() throws Exception {
        this.logger.info( JSON.toJSONString (sysuserService.fndByUsername("2")));
    }

}