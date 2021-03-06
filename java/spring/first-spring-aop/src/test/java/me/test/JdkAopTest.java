package me.test;

import me.U;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
// 默认查找
// 'classpath:me/test/JdkAopTestContext.groovy'
// '/com/example/MyTest-context.xml'
//@ContextConfiguration(classes = {JdkAopTest.Conf.class})
public class JdkAopTest {

//    @Configuration
//    @ComponentScan(basePackages = "me.test")
//    @EnableAspectJAutoProxy
//    public static class Conf {
//
//    }

    private final Logger logger = LoggerFactory.getLogger(JdkAopTest.class);

    @Autowired
    @Qualifier("aaa")
    private Object obj;

    @Test
    public void test() {
        U.logTest(logger, obj);
    }

}
