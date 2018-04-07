package com.helloworld.use.setter.decorator;

import com.helloworld.use.HelloApi;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * Create by yangshunfan
 * 2018/4/7 11:34
 */
public class DecoratorBeanTest {

    /**
     * 测试使用ref标签引用其他bean
     * 用到一个装饰bean
     */
    @Test
    public void test() {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("spring.xml");
        HelloApi decoratorBean = beanFactory.getBean("decorator",HelloApi.class);
        decoratorBean.sayHello();

        HelloApi decoratorBean2 = beanFactory.getBean("decorator2",HelloApi.class);
        decoratorBean2.sayHello();
    }
}