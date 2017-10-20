package com.goku.druid.demo.service;

import com.goku.druid.demo.model.FormElement;
import com.goku.druid.demo.model.UserWithBLOBs;
import com.goku.druid.demo.datahelper.DataSource;

/**
 * Created by nbfujx on 2017-10-18.
 */
public interface UserService {
    @DataSource("master")
    UserWithBLOBs selectByPrimaryKey(String id);

    @DataSource("slave")
    FormElement selectByPrimaryKey2(Integer id);
}
