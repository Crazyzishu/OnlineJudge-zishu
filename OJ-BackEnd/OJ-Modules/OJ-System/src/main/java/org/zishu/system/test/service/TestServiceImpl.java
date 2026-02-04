package org.zishu.system.test.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zishu.system.test.mapper.TestMapper;

import java.util.List;

@Service
public class TestServiceImpl implements TestService {


    @Autowired
    private TestMapper testMapper;


    @Override
    public List<?> list() {
        return testMapper.selectList(new LambdaQueryWrapper<>());
    }
}
