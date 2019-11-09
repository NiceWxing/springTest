package com.yimi.spring.dip;

public class PythonCourse implements ICourse {
    @Override
    public void study() {
        System.out.println("Tom 在学习Python的课程");
    }
}
