package com.helloworld.use.di.construcor;

import com.helloworld.use.HelloApi;

/**
 * Create by yangshunfan
 * 2018/4/6 14:24
 */
public class HelloWorld3 implements HelloApi {

    private String message;
    private Integer index;
    //无参的构造器
    public HelloWorld3() {
    }
    //有参的构造器
    public HelloWorld3(String message, int index) {
        this.message = message;
        this.index = index;
    }

    @Override
    public void sayHello() {
        System.out.println(message + ":" + index);
    }
}
