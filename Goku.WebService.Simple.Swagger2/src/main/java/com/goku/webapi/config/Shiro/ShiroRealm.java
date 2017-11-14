package com.goku.webapi.config.Shiro;

import com.goku.webapi.mapper.ext.sysMenuExtMapper;
import com.goku.webapi.mapper.ext.sysUserExtMapper;
import com.goku.webapi.model.sysMenu;
import com.goku.webapi.model.sysRole;
import com.goku.webapi.model.sysUser;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by nbfujx on 2017/11/7.
 */
public class ShiroRealm extends AuthorizingRealm {

    @Autowired
    private sysUserExtMapper sysuserextmapper;
    @Autowired
    private sysMenuExtMapper sysmenuextmapper;

    /**
     *权限验证
     * **/
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        sysUser user = sysuserextmapper.selectByUsername((String) principalCollection.getPrimaryPrincipal());
        //把principals放session中 key=userId value=principals
        SecurityUtils.getSubject().getSession().setAttribute(String.valueOf(user.getId()),SecurityUtils.getSubject().getPrincipals());
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        //赋予角色
        for(sysRole userRole:user.getSysrole()){
            info.addRole(userRole.getRoleName());
        }
        //赋予权限
        for(sysMenu menu:sysmenuextmapper.selectByUserId(user.getId())){
            info.addStringPermission(menu.getPerms());
        }

        return info;

    }

    /**
     * 登录验证
     * **/
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        String userName=token.getUsername();
        sysUser user = sysuserextmapper.selectByUsername(token.getUsername());
        if (user != null) {
            //设置用户session
            Session session = SecurityUtils.getSubject().getSession();
            session.setAttribute("user", user);
            return new SimpleAuthenticationInfo(userName,user.getPassword(),getName());
        } else {
            return null;
        }
    }
}
