package com.helloworld.use.statis.factory;

import com.helloworld.use.HelloApi;

/**
 * Create by yangshunfan
 * 2018/4/5 16:36
 */
public class HelloWorld2 implements HelloApi {
    private String message;


    public HelloWorld2(String message) {
        this.message = message;
    }

    @Override
    public void sayHello() {
        System.out.println(message);
    }
}
