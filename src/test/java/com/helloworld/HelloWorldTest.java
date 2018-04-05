package com.helloworld;

import com.helloworld.use.HelloApi;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Create by yangshunfan
 * 2018/4/5 15:55
 */
public class HelloWorldTest {

    @Test
    public void test() {
        //使用构造器实例化bean
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("spring.xml");

        HelloApi bean1 = beanFactory.getBean("bean1", HelloApi.class);
        bean1.sayHello();
        HelloApi bean2 = beanFactory.getBean("bean2", HelloApi.class);
        bean2.sayHello();
    }
}