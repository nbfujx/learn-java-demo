package com.goku.mybatis.mapper.ext;

import com.goku.mybatis.model.sysUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * Created by nbfujx on 2017/10/14.
 */
public interface sysUserExtMapper {

    sysUser selectByUsername(String username);

    sysUser validUser(@Param("username") String username, @Param("password") String password, @Param("orgid") String orgid);

    List<Map<String, String>> selectUserByOrgid(@Param("orgid") String orgid, @Param("orderSort") String orderSort, @Param("orderFiled") String orderFiled);

    Map<String, String> selectUserByUsername(@Param("username") String username);


}
