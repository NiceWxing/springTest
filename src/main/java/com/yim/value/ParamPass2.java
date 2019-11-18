package com.yim.value;


/**
 * 上面代码中，定义了一个User类，在main方法中，new了一个新的User对象user，然后给user对象的成员变量赋值，pass方法中，修改了传入的user对象的属性。
 *
 * 运行main方法，结果如下：
 *
 * pass方法调用前，user= User{name='张三', age=18}
 * pass方法中,user = User{name='李四', age=18}
 * pass方法调用后，user= User{name='李四', age=18}
 * 经过pass方法执行后，实参的值竟然被改变了！！！那按照上面的引用传递的定义，实际参数的值被改变了，这不就是引用传递了么？
 *
 * 有同学可能会说：难道在Java的方法中，在传递基本数据类型的时候是值传递，在传递引用数据类型的时候是引用传递？
 *
 * 其实不然，Java中传递引用数据类型的时候也是值传递。
 *
 * 为什么呢？
 *
 * 先给大家说一下概念中的重点：
 *
 * 值传递，是指在调用函数时将实际参数复制一份传递到函数中，这样在函数中如果对参数进行修改，将不会影响到实际参数。
 *
 * 引用传递，是指在调用函数时将实际参数的地址直接传递到函数中，那么在函数中对参数所进行的修改，将影响到实际参数。
 *
 * 总结下两者的区别：
 *
 *          值传递	    引用传递
 * 根本区别	会创建副本	不会创建副本
 * 所以	函数中无法改变原始对象	函数中可以改变原始对象
 * 敲黑板：复制的是参数的引用（地址值），并不是引用指向的存在于堆内存中的实际对象。
 *
 * main方法中的user是一个引用（也就是一个指针），它保存了User对象的地址值，当把user的值赋给pass方法的user形参后，即让pass方法的user形参也保存了这个地址值，即也会引用到堆内存中的User对象。
 *
 * 上面代码中，之所以产生引用传递的错觉，是因为参数保存的是实际对象的地址值，你改变的只是地址值指向的堆内存中的实际对象，并没有真正改变参数，参数的地址值没有变。
 */
public class ParamPass2 {

    public static void main(String[] args) {
        ParamPass2 p = new ParamPass2();

        User user = new User();
        user.setName("张三");
        user.setAge(18);

        System.out.println("pass方法调用前，user=" + user.toString());
        p.pass(user);
        System.out.println("pass方法调用后，user=" + user.toString());
    }

    public void pass(User user) {
        user.setName("李四");
        System.out.println("pass方法中,user = " + user.toString());
    }
}

