package test.com.goku.mybatis.mapper.ext;

import com.goku.mybatis.WebapiApplication;
import com.goku.mybatis.mapper.ext.sysOrgExtMapper;
import com.goku.mybatis.mapper.ext.sysUserExtMapper;
import com.goku.mybatis.model.sysOrg;
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
public class sysOrgExtMapperTest  {

    private Logger logger = LoggerFactory.getLogger(sysOrgExtMapperTest.class);

    @Autowired
    private sysOrgExtMapper sysorgextmapper;

    @Test
    public void selectextend1() throws Exception {
        sysOrg user= sysorgextmapper.selectextend1("1");
        this.logger.info("执行成功个数："+user.getName()+":"+user.getSysuser().size());
    }
    @Test
    public void selectextend2() throws Exception {
        sysOrg user= sysorgextmapper.selectextend2("1");
        this.logger.info("执行成功个数："+user.getName()+":"+user.getSysuser().size());
    }
}