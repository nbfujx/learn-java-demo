package com.goku.webapi.controller.impl;

import com.alibaba.fastjson.JSON;
import com.goku.webapi.controller.loginController;
import com.goku.webapi.util.enums.returnCode;
import com.goku.webapi.util.message.returnMsg;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.session.SessionException;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.ErrorAttributes;
import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;


/**
 * Created by nbfujx on 2017-11-07.
 */
@RestController
public class loginControllerImpl implements loginController,ErrorController {


    private final static String ERROR_PATH = "/error";

    @Autowired
    private ErrorAttributes errorAttributes;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(
            @RequestParam(value = "username", required = true) String userName,
            @RequestParam(value = "password", required = true) String password,
            @RequestParam(value = "rememberMe", required = true, defaultValue = "false") boolean rememberMe
    ) {
        String passwordmd5 = new Md5Hash(password, "2").toString();
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(userName, passwordmd5);
        token.setRememberMe(rememberMe);
        try {
            subject.login(token);
        } catch (AuthenticationException e) {
            e.printStackTrace();
            return JSON.toJSONString (new  returnMsg(returnCode.ERROR));
        }
        return  JSON.toJSONString (new  returnMsg(returnCode.SUCCESS));
    }


    @Override
    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout() {
        Subject subject = SecurityUtils.getSubject();
        try {
            subject.logout();
        }catch (SessionException e){
            e.printStackTrace();
            return JSON.toJSONString (new  returnMsg(returnCode.ERROR));
        }
        return JSON.toJSONString (new  returnMsg(returnCode.SUCCESS));
    }

    @Override
    @RequestMapping(value = "/notAuthc", method = RequestMethod.GET)
    public String notAuthc() {
        return JSON.toJSONString (new  returnMsg(returnCode.NOTAUTHC));
    }

    @Override
    @RequestMapping(value = "/notAuthz", method = RequestMethod.GET)
    public String notAuthz() {
        return  JSON.toJSONString (new  returnMsg(returnCode.NOTAUTHZ));
    }

    @Override
    @RequestMapping(value =ERROR_PATH)
    public String error(HttpServletRequest request)
    {
        Map<String, Object> body = getErrorAttributes(request, getTraceParameter(request));
        return  JSON.toJSONString (new  returnMsg(returnCode.ERROR,body));
    }

    @Override
    public String getErrorPath() {
        return ERROR_PATH;
    }

    private boolean getTraceParameter(HttpServletRequest request) {
        String parameter = request.getParameter("trace");
        if (parameter == null) {
            return false;
        }
        return !"false".equals(parameter.toLowerCase());
    }

    private Map<String, Object> getErrorAttributes(HttpServletRequest request,boolean includeStackTrace) {
        RequestAttributes requestAttributes = new ServletRequestAttributes(request);
        Map<String, Object> map = this.errorAttributes.getErrorAttributes(requestAttributes,includeStackTrace);
        String URL = request.getRequestURL().toString();
        map.put("URL", URL);
        return map;
    }

}
