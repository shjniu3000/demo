package com.jtthink.controller;

import com.jtthink.service.TestService;
import com.jtthink.service.TestService2;
import com.jtthink.service.TestServiceInterface;



public class TestCtroller {

    public String TestCtrollero;


    /**
     * @Author niushijin
     */
    public void say1(){
        TestServiceInterface ti = new TestService();
        ti.say1();

        new TestService().bye();

        System.out.println("a1");

    }

    public void say2(){
        TestServiceInterface ti = new TestService2();
        ti.say1();
        System.out.println("a2");

    }

    public void say3(){
        System.out.println("a3");

    }



}
