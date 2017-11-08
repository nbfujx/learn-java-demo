package com.goku.webapi.controller.impl;

import com.alibaba.fastjson.JSON;
import com.goku.webapi.controller.sysMenuController;
import com.goku.webapi.service.sysMenuService;
import com.goku.webapi.service.sysUserService;
import com.goku.webapi.util.enums.returnCode;
import com.goku.webapi.util.message.returnMsg;
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
public class sysMenuControllerImpl implements sysMenuController {

    @Autowired
    sysMenuService sysmenuService;

    @Override
    @RequestMapping(value="getMenu/{id}", method = RequestMethod.GET)
    @RequiresPermissions(value={"sysMenu:selectByid"})
    public String  selectByid(@PathVariable long id) {
        return JSON.toJSONString (new returnMsg(returnCode.SUCCESS,sysmenuService.selectByid(id)));
    }
}
