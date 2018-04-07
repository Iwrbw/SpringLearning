package com.helloworld.use.setter;

import com.helloworld.use.HelloApi;

import java.util.List;

/**
 * Create by yangshunfan
 * 2018/4/6 15:59
 */
public class HelloWorld4 implements HelloApi{
    private String message;
    private Integer index;
    private List<String> test;

    public void setTest(List<String> test) {
        this.test = test;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    @Override
    public void sayHello() {
        System.out.println(message + ":" + index);
    }
}
