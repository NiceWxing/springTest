package com.yimi.spring.Factory.SimpleFactoryPattern;

public class PythonCourse implements ICourse {
    @Override
    public void record() {
        System.out.println("录制Python 视频");
    }
}
