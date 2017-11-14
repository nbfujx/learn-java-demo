package com.goku.webapi.controller.impl;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.goku.webapi.controller.sysUserController;

import com.goku.webapi.service.sysUserService;
import com.goku.webapi.util.enums.returnCode;
import com.goku.webapi.util.message.returnMsg;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * Created by nbfujx on 2017/10/15.
 */
@RestController
@RequestMapping("sysUser")
@Api(value="用户管理")
public class sysUserControllerImpl implements sysUserController {

    private Logger logger = LoggerFactory.getLogger(sysUserControllerImpl.class);

    @Autowired
    sysUserService sysuserService;

    @Override
    @ApiOperation(value="用户查询", notes="用户信息查询")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "用户id", required = true, dataType = "String",paramType="path"),
    })
    @RequestMapping(value="getUser/{id}", method = RequestMethod.GET)
    @RequiresPermissions(value={"sysUser:selectByid"})
    public String  selectByid(@PathVariable String id) {
        this.logger.info("selectByid");
        return JSON.toJSONString (new returnMsg(returnCode.SUCCESS,sysuserService.selectByid(id)));
    }
}
