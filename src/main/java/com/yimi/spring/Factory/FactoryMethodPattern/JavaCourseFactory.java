package com.yimi.spring.Factory.FactoryMethodPattern;

import com.yimi.spring.Factory.SimpleFactoryPattern.ICourse;
import com.yimi.spring.Factory.SimpleFactoryPattern.JavaCourse;

public class JavaCourseFactory implements ICourseFactory {
    @Override
    public ICourse create() {
        return new JavaCourse();
    }
}
