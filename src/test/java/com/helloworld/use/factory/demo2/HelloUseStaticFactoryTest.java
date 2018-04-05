package com.helloworld.use.factory.demo2;

import com.helloworld.use.HelloApi;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Create by yangshunfan
 * 2018/4/5 16:51
 * 先创静态工厂类bean，在用静态工厂类的bean去实例化bean
 */
public class HelloUseStaticFactoryTest {
    @Test
    public void testUseStaticFactoryDemo2() {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("spring.xml");

        HelloApi bean4 = beanFactory.getBean("bean4",HelloApi.class);
        bean4.sayHello();
    }
}