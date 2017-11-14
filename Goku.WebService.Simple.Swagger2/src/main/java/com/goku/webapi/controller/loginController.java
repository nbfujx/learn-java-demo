package com.goku.webapi.controller;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by nbfujx on 2017-11-07.
 */
public interface loginController {
    String login(String userName, String password,boolean rememberMe);
    String logout();
    String notAuthc();
    String notAuthz();
    String error(HttpServletRequest request);
}
