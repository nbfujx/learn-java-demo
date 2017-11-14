package com.goku.webapi.controller.impl;

import com.alibaba.fastjson.JSON;
import com.goku.webapi.controller.sysMenuController;
import com.goku.webapi.service.sysMenuService;
import com.goku.webapi.service.sysUserService;
import com.goku.webapi.util.enums.returnCode;
import com.goku.webapi.util.message.returnMsg;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by nbfujx on 2017/11/7.
 */
@RestController
@RequestMapping("sysMenu")
@Api(value="菜单管理")
public class sysMenuControllerImpl implements sysMenuController {

    @Autowired
    sysMenuService sysmenuService;

    @Override
    @RequestMapping(value="getMenu/{id}", method = RequestMethod.GET)
    @RequiresPermissions(value={"sysMenu:selectByid"})
    @ApiOperation(value="菜单查询", notes="菜单信息查询")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "菜单id", required = true, dataType = "String",paramType="path"),
    })
    public String  selectByid(@PathVariable String id) {
        return JSON.toJSONString (new returnMsg(returnCode.SUCCESS,sysmenuService.selectByid(id)));
    }
}
