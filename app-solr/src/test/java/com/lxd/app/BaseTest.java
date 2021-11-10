package com.lxd.app;

import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class BaseTest {

    @Before
    public void init(){
        System.out.println("开始测试---------------");
    }

    @After
    public void after(){
        System.out.println("结束测试---------------");
    }
}
