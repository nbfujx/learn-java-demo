package com.goku.druid.demo.controller.impl;

import com.alibaba.fastjson.JSON;
import com.goku.druid.demo.controller.UserController;
import com.goku.druid.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by nbfujx on 2017-10-18.
 */
@RestController
@RequestMapping("User")
public class UserControllerImpl implements UserController {

    @Autowired
    UserService userService;

    @Override
    @RequestMapping(value="getUser/{id}", method = RequestMethod.GET)
    public String selectByPrimaryKey(@PathVariable String id) {
        return JSON.toJSONString(userService.selectByPrimaryKey(id));
    }

    @Override
    @RequestMapping(value="getFormElement/{id}", method = RequestMethod.GET)
    public String selectByPrimaryKey2(@PathVariable Integer id) {
        return JSON.toJSONString(userService.selectByPrimaryKey2(id));
    }
}
