package com.goku.mybatis.controller.impl;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.goku.mybatis.controller.sysUserController;

import com.goku.mybatis.service.sysUserService;
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
public class sysUserControllerImpl implements sysUserController {


    private Logger logger = LoggerFactory.getLogger(sysUserControllerImpl.class);

    @Autowired
    sysUserService sysuserService;


    @Override
    @RequestMapping(value="getUser/{username}", method = RequestMethod.GET)
    public String fndByUsername(@PathVariable String username) {
        return JSON.toJSONString (sysuserService.fndByUsername(username));
    }
}
