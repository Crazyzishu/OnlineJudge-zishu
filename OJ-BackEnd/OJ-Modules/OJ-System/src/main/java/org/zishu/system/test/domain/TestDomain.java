package org.zishu.system.test.domain;

import com.baomidou.mybatisplus.annotation.TableName;

/*
指定该实体类映射到数据库中的 tb_test 表。
实现对象关系映射
 */
@TableName("tb_test")
public class TestDomain {

    private Integer testId;
    private String title;
    private String content;

    public Integer getTestId() {
        return testId;
    }

    public void setTestId(Integer testId) {
        this.testId = testId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
