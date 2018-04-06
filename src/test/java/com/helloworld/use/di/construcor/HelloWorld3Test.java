package com.helloworld.use.di.construcor;

import com.helloworld.use.HelloApi;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Create by yangshunfan
 * 2018/4/6 14:31
 */
public class HelloWorld3Test {

    @Test
    public void testDiConstrucor() {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("spring.xml");
        HelloApi byIndex = beanFactory.getBean("byIndex",HelloWorld3.class);
        byIndex.sayHello();

        HelloApi byType = beanFactory.getBean("byType",HelloWorld3.class);
        byType.sayHello();

        HelloApi byName = beanFactory.getBean("byName",HelloWorld3.class);
        byName.sayHello();
    }

}