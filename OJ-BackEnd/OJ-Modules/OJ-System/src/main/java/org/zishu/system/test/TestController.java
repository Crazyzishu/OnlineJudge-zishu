package org.zishu.system.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.zishu.system.test.service.TestService;

import java.util.List;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private TestService testService;


    //    /test/list 查询tb_test所有数据
    @GetMapping("/list")
    public List<?> list(){
        return testService.list();
    }

}
