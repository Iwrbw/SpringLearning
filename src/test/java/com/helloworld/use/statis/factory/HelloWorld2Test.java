package com.helloworld.use.statis.factory;

import com.helloworld.use.HelloApi;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Create by yangshunfan
 * 2018/4/5 16:17
 * 使用静态工厂来实例化bean
 */
public class HelloWorld2Test {
    @Test
    public void testHelloWorldUseFactory() {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("spring.xml");

        HelloApi bean3 = beanFactory.getBean("bean3", HelloApi.class);
        bean3.sayHello();
    }
}