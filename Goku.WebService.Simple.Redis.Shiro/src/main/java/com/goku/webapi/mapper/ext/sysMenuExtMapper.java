package com.goku.webapi.mapper.ext;

import com.goku.webapi.mapper.sysMenuMapper;
import com.goku.webapi.model.sysMenu;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by nbfujx on 2017-11-07.
 */
public interface sysMenuExtMapper extends sysMenuMapper {
    List<sysMenu> selectByUserId(@Param("id") String id);
}
