package com.goku.mybatis.mapper;

import com.goku.mybatis.model.sysUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface sysUserMapper {

    @Select("SELECT * FROM sys_user WHERE username = #{username}")
    sysUser findByUsername(@Param("username") String username);

}