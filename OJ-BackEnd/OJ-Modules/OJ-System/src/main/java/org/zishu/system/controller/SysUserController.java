package org.zishu.system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.zishu.system.service.SysUserService;


@RestController
public class SysUserController {

    @Autowired
    private SysUserService sysUserService;

    //返回登录成功还是失败    bool true false / int code 1/0
    //如果失败返回原因      String msg
    //请求方法 和 url
    public LoginResult login(String userAccount, String password){
        return sysUserService.login(userAccount, password);
    }
}
