package com.yimi.spring.Factory.AbastractFactoryPattern;

public class PythonNote implements INote {
    @Override
    public void edit() {
        System.out.println("编写 Python 笔记");
    }
}
