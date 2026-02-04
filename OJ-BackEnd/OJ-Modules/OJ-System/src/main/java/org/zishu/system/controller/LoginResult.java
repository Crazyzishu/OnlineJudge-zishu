package org.zishu.system.controller;

import lombok.Getter;
import lombok.Setter;

/**
 * 登录返回值
 */

@Getter
@Setter
public class LoginResult{

    private int code;//  0 失败   1 成功

    private String msg;//失败的原因
}
