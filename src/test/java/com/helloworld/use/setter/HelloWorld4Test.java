package com.helloworld.use.setter;

import com.helloworld.use.HelloApi;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Create by yangshunfan
 * 2018/4/6 16:02
 */
public class HelloWorld4Test {
    @Test
    public void testSetter() {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("spring.xml");
        HelloApi bean4 = beanFactory.getBean("bean5",HelloApi.class);
        bean4.sayHello();
    }
}