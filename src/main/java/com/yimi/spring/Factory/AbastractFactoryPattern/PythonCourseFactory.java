package com.yimi.spring.Factory.AbastractFactoryPattern;

public class PythonCourseFactory implements CourseFactory {
    @Override
    public INote createNote() {
        return new PythonNote();
    }

    @Override
    public IVideo createVidoeo() {
        return new PythonVideo();
    }
}
