package com.yimi.spring.Factory.FactoryMethodPattern;

import com.yimi.spring.Factory.SimpleFactoryPattern.ICourse;

public class FactoryMethod {
    public static void main(String[] args) {

        ICourseFactory factory = new PythonCourseFactory();
        ICourse course = factory.create();
        course.record();

        factory = new JavaCourseFactory();
        course = factory.create();
        course.record();
    }
}
