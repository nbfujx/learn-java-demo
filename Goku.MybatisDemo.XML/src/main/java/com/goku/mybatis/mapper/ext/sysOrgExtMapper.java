package com.goku.mybatis.mapper.ext;

import com.goku.mybatis.model.sysOrg;
import com.goku.mybatis.model.sysUser;
import org.apache.ibatis.annotations.Param;

/**
 * Created by nbfujx on 2017/10/24.
 */
public interface sysOrgExtMapper {

    sysOrg selectextend1(@Param("id") String id);

    sysUser findsysUserByOrgId(@Param("id") String id);

    sysOrg selectextend2(@Param("id") String id);
}
