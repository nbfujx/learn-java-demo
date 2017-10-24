package com.goku.mybatis.service;



import com.goku.mybatis.model.sysUser;

import java.util.List;
import java.util.Map;

/**
 * Created by nbfujx on 2017/10/14.
 */
public interface sysUserService {
    sysUser fndByUsername(String username);
}
