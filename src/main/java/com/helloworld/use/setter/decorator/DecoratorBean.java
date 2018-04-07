package com.helloworld.use.setter.decorator;

import com.helloworld.use.HelloApi;

/**
 * Create by yangshunfan
 * 2018/4/7 11:24
 */
public class DecoratorBean implements HelloApi {

    private HelloApi helloApi;

    private String message;

    public DecoratorBean(HelloApi helloApi,String message) {
        this.helloApi = helloApi;
        this.message = message;
    }

    public DecoratorBean() {
    }

    public void setHelloApi(HelloApi helloApi) {
        this.helloApi = helloApi;
    }

    public void setMessage(String message) {
        this.message = message;
    }


    @Override
    public void sayHello() {
        System.out.println("装饰一下");
        helloApi.sayHello();
        System.out.println("画龙点睛");
    }
}
