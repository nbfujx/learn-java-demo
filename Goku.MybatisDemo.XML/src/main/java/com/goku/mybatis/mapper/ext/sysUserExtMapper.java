package com.goku.mybatis.mapper.ext;

import com.goku.mybatis.model.sysUser;
import com.goku.mybatis.model.sysUserInfo;
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

    int  insertsysUser(sysUser sysuser);

    int insertsysUser2(sysUser sysuser);

    int insertsysUser3(sysUser sysuser);

    int updateUser(sysUser sysuser);

    int deleteByUserName(@Param("username") String username);

    sysUser selectByUsernameORorg(@Param("username") String username,@Param("name") String name,@Param("orgid") String orgid);

    sysUser selectByUsernameORorg2(@Param("username") String username,@Param("name") String name);

    List<Map<String, String>>  selectUserByOrgid2(List  org_ids);

    List<sysUser> selectByUsername2(@Param("username") String username);

    sysUser selectextends(String username);

    sysUser selectextends2(String username);

    Map<String, String> selectextends3(@Param("username") String username);

    sysUserInfo findsysUserInfoById(@Param("id") String id);

    sysUser selectextends4(@Param("username") String username);

    sysUser selectextends5(@Param("username") String username);

    sysUser selectextends6(@Param("username") String username);
}
