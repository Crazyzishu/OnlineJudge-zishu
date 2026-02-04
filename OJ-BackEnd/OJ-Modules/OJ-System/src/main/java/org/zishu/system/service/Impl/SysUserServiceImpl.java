package org.zishu.system.service.Impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zishu.system.controller.LoginResult;
import org.zishu.system.domain.SysUser;
import org.zishu.system.mapper.SysUserMapper;
import org.zishu.system.service.SysUserService;

@Service
public class SysUserServiceImpl implements SysUserService {
    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public LoginResult login(String userAccount, String password) {
        //通过 账号 去向数据库中查询，对应的用户信息
        LambdaQueryWrapper<SysUser> queryWrapper = new LambdaQueryWrapper<>();
        //select password from tb_sys_user where user_account = #{userAccount}
        SysUser sysUser = sysUserMapper.selectOne(queryWrapper.select(SysUser::getPassword)
                .eq(SysUser::getUserAccount, userAccount));

        LoginResult loginResult = new LoginResult();
        if(sysUser == null){
            loginResult.setCode(0);
            loginResult.setMsg("当前登录账户不存在");
            return loginResult;
        }
        if(sysUser.getPassword().equals(password)){
            loginResult.setCode(1);
            return loginResult;
        }
        loginResult.setCode(0);
        loginResult.setMsg("账号或密码错误");
        return loginResult;
    }
}
