package com.goku.mybatis.service;

/**
 * Created by nbfujx on 2017/10/15.
 */
public interface loginService {
    boolean validUser(String username, String password, String orgid);
}
