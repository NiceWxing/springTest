package com.yimi.spring.Proxy.JDKProxy;

import com.yimi.spring.Proxy.StaticProxy.Person;

public class Test {

    public static void main(String[] args) {
        try {
            Person obj = (Person) new JDKMeipo().getInstance(new Custormer());
            obj.findLove();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
