package com.yimi.spring.Factory.AbastractFactoryPattern;


/**
 * 上面的代码完整地描述了两个产品族：Java课程和Python课程，也描述了两个产品等级的视频和笔记
 * 抽象工厂模式非常清晰的描述了这样一层复杂的关系。但是，不知道有没有发现。如果我们再继续扩展产品等级，将
 * 源码Source也加入课程，那么我们的代码从抽象工厂到具体工厂要全部调整，很显然不符合开闭原则。由此可知
 * 抽象工厂模式也是有缺点的：
 *
 * 1.规定了所有可能被创建的产品集合，产品族中扩展新的产品困难，需要修改抽象工厂的借口。
 *
 * 2.增加了系统的抽象性和理解难度。
 *
 */
public class AbastractFactoryTest {
     public static void main(String[] args) {
        JavaCourseFactory factory = new JavaCourseFactory();
        factory.createNote().edit();
        factory.createVidoeo().record();
    }
}
