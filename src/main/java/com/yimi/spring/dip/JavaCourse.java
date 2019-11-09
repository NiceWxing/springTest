package com.yimi.spring.dip;

public class JavaCourse implements ICourse {
    @Override
    public void study() {
        System.out.println("Tom 在学习Java的课程");
    }
}
