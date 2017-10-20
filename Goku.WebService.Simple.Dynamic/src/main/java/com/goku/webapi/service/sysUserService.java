package com.goku.webapi.service;



import com.goku.webapi.config.druid.DataSource;
import com.goku.webapi.model.sysUser;

import java.util.List;
import java.util.Map;

/**
 * Created by nbfujx on 2017/10/14.
 */
public interface sysUserService {
    sysUser selectByUsername(String username);
    @DataSource("master")
    sysUser selectByid(String id);
    @DataSource("slave")
    List<Map<String, String>> selectUserByOrgid(String orgid, String orderSort, String orderFiled);
    Map<String, String> selectUserByUsername(String username);
}
