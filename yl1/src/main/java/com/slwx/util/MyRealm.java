package com.slwx.util;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;

import java.util.Set;

/**
 * @author 狗蛋
 * @create 2019-10-13-15:58
 */
public class MyRealm extends AuthorizingRealm {
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        return null;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        return null;
    }

//    private ShiroUserService shiroUserService;
//
//    public ShiroUserService getShiroUserService() {
//        return shiroUserService;
//    }
//
//    public void setShiroUserService(ShiroUserService shiroUserService) {
//        this.shiroUserService = shiroUserService;
//    }
//
//    /**
//     * 授权
//     * @param principalCollection
//     * @return
//     */
//
//    @Override
//    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
//        ShiroUser shiroUser = this.shiroUserService.queryByName(principals.getPrimaryPrincipal().toString());
//        Set<String> roleids = this.shiroUserService.getRolesByUserId(shiroUser.getUserid());
//        Set<String> perids = this.shiroUserService.getPersByUserId(shiroUser.getUserid());
//        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
//        info.setRoles(roleids);
//        info.setStringPermissions(perids);
//        return info;
//    }
//
//    /**
//     * 认证
//     * @param token         从jsp传递过来的用户名密码组合成的一个token对象
//     * @return
//     * @throws AuthenticationException
//     *
//     * 认证过程：
//     * 1.数据源（ini--》数据库）
//     * 2.AuthenticationInfo将数据库的用户信息给subject主题做shiro认证的
//     *      2.1.需要在当前的realm中调用service来验证，当前用户是否在数据库中存在
//     *      2.2.盐加密
//     */
//    @Override
//    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
//        String uname = token.getPrincipal().toString();
//        String pwd = token.getCredentials().toString();
//        ShiroUser shiroUser = this.shiroUserService.queryByName(uname);
//        AuthenticationInfo info = new SimpleAuthenticationInfo(
//                shiroUser.getUsername(),
//                shiroUser.getPassword(),
//                ByteSource.Util.bytes(shiroUser.getSalt()),
//                this.getName()//MyRealm的全路径
//        );
//        return info;
//    }
}
