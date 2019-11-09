package com.yimi.spring.dip;

public class Tom1 {
    private ICourse iCourse;

    public void setCourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }

    public void study() {
        iCourse.study();
    }


    public static void main(String[] args) {
        Tom1 tom1 = new Tom1();
        tom1.setCourse(new JavaCourse());
        tom1.study();
        tom1.setCourse(new PythonCourse());
        tom1.study();
    }
}
