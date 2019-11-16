package com.yimi.spring.Factory.AbastractFactoryPattern;

public class JavaCourseFactory implements CourseFactory {
    @Override
    public INote createNote() {
        return new JavaNote();
    }

    @Override
    public IVideo createVidoeo() {
        return new JavaVideo();
    }
}
