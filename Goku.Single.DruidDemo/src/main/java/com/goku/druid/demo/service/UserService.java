package com.goku.druid.demo.service;

import com.goku.druid.demo.model.UserWithBLOBs;

/**
 * Created by nbfujx on 2017-10-18.
 */
public interface UserService {
    UserWithBLOBs selectByPrimaryKey(String id);
}
