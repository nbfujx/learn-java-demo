package com.goku.webapi.controller.impl;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.goku.webapi.controller.sysUserController;

import com.goku.webapi.service.sysUserService;
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
    @RequestMapping(value="getUserPassword", method = RequestMethod.GET)
    public String getUserPassword(){
        this.logger.info("getUserPassword");
        PageHelper.startPage(1, 1);
        List<Map<String, String>> list = sysuserService.selectUserByOrgid("1","desc","id");
        PageInfo pageInfo = new PageInfo(list);
        Page page = (Page) list;
        return "PageInfo: " + JSON.toJSONString(pageInfo) + ", Page: " + JSON.toJSONString(page);
    }

    @Override
    @RequestMapping(value="getUser/{id}", method = RequestMethod.GET)
    public String  selectByid(@PathVariable String id) {
        this.logger.info("selectByid");
        return   JSON.toJSONString (sysuserService.selectByid(id));
    }
}
