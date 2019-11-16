package com.yimi.spring.Factory.SimpleFactoryPattern;

public class JavaCourse implements ICourse {
    @Override
    public void record() {
        System.out.println("录制Java视频");
    }
}
