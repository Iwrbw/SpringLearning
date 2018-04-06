package com.helloworld.use.di.construcor;

import com.helloworld.use.HelloApi;

/**
 * Create by yangshunfan
 * 2018/4/6 14:40
 */
public class HelloWorld3Factory {

    //必须是静态的，因为class属性必须制定，所以必须是静态的方法
    public static HelloApi newInstance(String message, Integer index){
        return new HelloWorld3(message,index);
    }

    public HelloApi newInstance(String message, int index) {
        return new HelloWorld3(message,index);
    }
}