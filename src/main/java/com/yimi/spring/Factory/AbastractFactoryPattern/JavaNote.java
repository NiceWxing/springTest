package com.yimi.spring.Factory.AbastractFactoryPattern;

public class JavaNote implements INote {
    @Override
    public void edit() {
        System.out.println("编写 Java 笔记");
    }
}
