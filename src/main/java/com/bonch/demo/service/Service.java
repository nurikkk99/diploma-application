package com.bonch.demo.service;

@org.springframework.stereotype.Service
public class Service {

    public String processString(String string) throws InterruptedException {
        Thread.sleep(200);
        System.out.println(string);
        return "returned";
    }

    public String test() {
        return "It's ok";
    }
}
