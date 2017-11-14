package com.goku.webapi.mapper.ext;

import com.goku.webapi.mapper.sysUserMapper;
import com.goku.webapi.model.sysUser;
import org.apache.ibatis.annotations.Param;


/**
 * Created by nbfujx on 2017/10/14.
 */
public interface sysUserExtMapper extends sysUserMapper {
    /**
    * @Author:nbfujx
    * @Param:
    * @param username  用户名
    * @Date: 13:45 2017-11-13
    */
    sysUser selectByUsername(@Param("username") String username);



}
