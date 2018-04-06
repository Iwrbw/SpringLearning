package com.helloworld.use.di.construcor;

import com.helloworld.use.HelloApi;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Create by yangshunfan
 * 2018/4/6 14:45
 */
public class HelloWorld3FactoryTest {
    @Test
    public void testHelloWorld3Factoyr() {
        /**
         * 这里使用静态工厂方法进行配置的时候回出现交错
         * 需要在spring.xml配置文件中配置一下autowire的属性
         */
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("spring.xml");
        HelloApi byIndexInFactory = beanFactory.getBean("ByIndex",HelloApi.class);
        byIndexInFactory.sayHello();

        //HelloApi byIndexInFactory2 = beanFactory.getBean("ByType",HelloApi.class);
        //byIndexInFactory2.sayHello();

        HelloApi byIndexInFactory3 = beanFactory.getBean("ByName",HelloApi.class);
        byIndexInFactory3.sayHello();

        /**
         * 这里使用工厂bean实例化bean
         */
        HelloApi byType = beanFactory.getBean("fByType",HelloApi.class);
        byType.sayHello();
    }
}