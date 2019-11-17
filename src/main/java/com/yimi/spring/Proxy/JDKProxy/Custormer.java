package com.yimi.spring.Proxy.JDKProxy;

import com.yimi.spring.Proxy.StaticProxy.Person;

public class Custormer implements Person {
    @Override
    public void findLove() {
        System.out.println("高富帅");
        System.out.println("身高180cm");
        System.out.println("有6块腹肌");
    }
}
