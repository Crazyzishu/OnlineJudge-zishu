package org.zishu.common.core.domin;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

/**
 * 基类实体类
 */

@Getter
@Setter
@ToString
@TableName("tb_sys_user")
public class BaseEntity {

    private Long createBy;

    private Long updateBy;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;
}
