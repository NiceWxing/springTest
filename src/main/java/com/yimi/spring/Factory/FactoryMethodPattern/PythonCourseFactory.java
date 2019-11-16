package com.yimi.spring.Factory.FactoryMethodPattern;

import com.yimi.spring.Factory.SimpleFactoryPattern.ICourse;
import com.yimi.spring.Factory.SimpleFactoryPattern.PythonCourse;

public class PythonCourseFactory implements ICourseFactory {
    @Override
    public ICourse create() {
        return new PythonCourse();
    }
}
