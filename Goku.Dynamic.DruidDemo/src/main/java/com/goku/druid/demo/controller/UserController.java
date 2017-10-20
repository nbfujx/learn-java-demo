package com.goku.druid.demo.controller;

import com.goku.druid.demo.model.FormElement;
import com.goku.druid.demo.model.UserWithBLOBs;

/**
 * Created by nbfujx on 2017-10-18.
 */
public interface UserController {
    String selectByPrimaryKey(String id);
    String selectByPrimaryKey2(Integer id);
}
