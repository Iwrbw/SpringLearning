package com.helloworld.use.statis.factory;

import com.helloworld.use.HelloApi;

/**
 * Create by yangshunfan
 * 2018/4/5 16:11
 */
public class HelloApiStaticFactory {

    //工厂方法
    public static HelloApi newInstance(String message) {
        return new HelloWorld2(message);
    }
}
