package org.zishu.system.service;

import org.springframework.stereotype.Service;
import org.zishu.system.controller.LoginResult;

@Service
public interface SysUserService {
    LoginResult login(String userAccount, String password);
}
