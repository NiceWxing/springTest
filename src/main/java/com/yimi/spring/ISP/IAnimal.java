package com.yimi.spring.ISP;


/**
 * 接口隔离原则
 * 这是错误的做法，真正的接口隔离是功能独立
 */
public interface IAnimal {
    void eat();
    void fly();
    void swim();
}
