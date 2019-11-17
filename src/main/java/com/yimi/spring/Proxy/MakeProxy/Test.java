package com.yimi.spring.Proxy.MakeProxy;

import com.yimi.spring.Proxy.JDKProxy.Custormer;
import com.yimi.spring.Proxy.StaticProxy.Person;

public class Test {
    public static void main(String[] args) {
        try {
            Person obj = (Person) new GPMeipo().getInstance(new Custormer());
            System.out.println(obj.getClass());
            obj.findLove();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
