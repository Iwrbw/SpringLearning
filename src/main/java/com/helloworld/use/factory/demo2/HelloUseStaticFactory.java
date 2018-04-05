package com.helloworld.use.factory.demo2;

import com.helloworld.use.HelloApi;
import com.helloworld.use.statis.factory.HelloWorld2;

/**
 * Create by yangshunfan
 * 2018/4/5 16:31
 */
public class HelloUseStaticFactory {

    public HelloApi newInstance(String message) {
        return new HelloWorld2(message);
    }
}
