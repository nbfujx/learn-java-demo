package test.com.goku.webapi.mapper.ext;

import com.alibaba.fastjson.JSON;
import com.goku.webapi.WebapiApplication;
import com.goku.webapi.mapper.ext.sysMenuExtMapper;
import com.goku.webapi.model.sysMenu;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by nbfujx on 2017-11-07.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = WebapiApplication.class)
public class sysMenuExtMapperTest{

    @Autowired
    sysMenuExtMapper  sysmenuextmapper;
    @Test
    public void selectByUserId() throws Exception {
        List<sysMenu> sysmenu=sysmenuextmapper.selectByUserId("1");
        System.out.print( JSON.toJSONString (sysmenu));
    }

}