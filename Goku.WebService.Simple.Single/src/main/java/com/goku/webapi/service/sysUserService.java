package com.goku.webapi.service;



import com.goku.webapi.model.sysUser;

import java.util.List;
import java.util.Map;

/**
 * Created by nbfujx on 2017/10/14.
 */
public interface sysUserService {
    sysUser selectByUsername(String username);
    sysUser selectByid(String id);
    List<Map<String, String>> selectUserByOrgid(String orgid, String orderSort, String orderFiled);
    Map<String, String> selectUserByUsername(String username);
}
