package com.yim.value;


/**
 * 下面结合生活中的场景，再来深入理解一下值传递和引用传递。
 *
 * 你有一把钥匙，当你的朋友想要去你家的时候，如果你直接把你的钥匙给他了，这就是引用传递。这种情况下，如果他对这把钥匙做了什么事情，比如他在钥匙上刻下了自己名字，那么这把钥匙还给你的时候，你自己的钥匙上也会多出他刻的名字。
 *
 * 你有一把钥匙，当你的朋友想要去你家的时候，你复刻了一把新钥匙给他，自己的还在自己手里，这就是值传递。这种情况下，他对这把钥匙做什么都不会影响你手里的这把钥匙。
 *
 * 但是，不管上面哪种情况，你的朋友拿着你给他的钥匙，进到你的家里，把你家的电视砸了。那你说你会不会受到影响？
 *
 * 我们在pass方法中，改变user对象的name属性的值的时候，不就是在“砸电视”么。你改变的不是那把钥匙（地址值），而是钥匙打开的房子（地址值对应的实际对象）。
 *
 * 那我们如何真正的改变参数呢，看如下代码：
 *
 *
 *
 * ------
 * 从结果看出，对参数进行了修改，没有影响到实际参数。
 *
 * 所以说，Java中其实还是值传递的，只不过对于引用类型参数，值的内容是对象的引用。
 * ------
 */
public class ParamPass3 {

    public static void main(String[] args) {
        ParamPass3 p = new ParamPass3();

        User user = new User();
        user.setName("张三");
        user.setAge(18);

        System.out.println("pass方法调用前，user= " + user.toString());
        p.pass(user);
        System.out.println("pass方法调用后，user= " + user.toString());
    }

    public void pass(User user) {
        user = new User();
        user.setName("李四");
        user.setAge(20);
        System.out.println("pass方法中,user = " + user.toString());
    }
}
