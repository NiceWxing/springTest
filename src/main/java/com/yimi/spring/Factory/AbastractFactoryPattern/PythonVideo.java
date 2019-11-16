package com.yimi.spring.Factory.AbastractFactoryPattern;

public class PythonVideo implements IVideo {
    @Override
    public void record() {
        System.out.println("录制 Python 视频");
    }
}
