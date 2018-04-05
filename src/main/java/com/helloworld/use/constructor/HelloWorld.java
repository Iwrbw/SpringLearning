package com.helloworld.use.constructor;

import com.helloworld.use.HelloApi;

/**
 * Create by yangshunfan
 * 2018/4/5 15:50
 */
public class HelloWorld implements HelloApi {

    private String message;

    public HelloWorld() {
    }

    public HelloWorld(String message) {
        this.message = message;
    }
    @Override
    public void sayHello() {
        System.out.println(message);
    }
}
