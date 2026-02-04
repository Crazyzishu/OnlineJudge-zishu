package org.zishu.system.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.zishu.common.core.domin.BaseEntity;

import java.time.LocalDateTime;

/**
 * 管理员用户实体类
 */
@Getter
@Setter
@ToString
@TableName("tb_sys_user")
public class SysUser extends BaseEntity{

    @TableId(type = IdType.ASSIGN_ID)
    private Long userId;//主键 不使用auto_increment 用mybatis-plus支持雪花算法处理自增id

    private String userAccount;

    private String password;
}
