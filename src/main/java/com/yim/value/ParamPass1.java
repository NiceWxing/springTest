package com.yim.value;

/**
 * 上面代码中，我们在类中定义了一个pass方法，方法内部将传入的参数i的值增加至3倍，然后分别在pass方法和main方法中打印参数的值，输出结果如下：
 *
 * pass方法执行前，i的值为=10
 * pass方法中，i的值为=30
 * pass方法执行后，i的值为=10
 * 从上面运行结果来看，pass方法中，i的值是30，pass方法执行结束后，变量i的值依然是10。
 *
 * 可以看出，main方法里的变量i，并不是pass方法里的i，pass方法内部对i的值的修改并没有改变实际参数i的值，改变的只是pass方法中i的值（pass方法中，i=30），因为pass方法中的i只是main方法中变量i的复制品。
 *
 * 因此同学们很容易得出结论：Java中，一个方法不可能修改一个基本数据类型的参数 ，所以是值传递。
 *
 * 然而，结论下的还太早，因为方法参数共有两种类型：
 *
 * 1.基本数据类型
 * 2.引用数据类型
 */
public class ParamPass1 {
        public static void main(String[] args) {
            ParamPass1 p = new ParamPass1();
            int i = 10;
            System.out.println("pass方法调用前，i的值为=" + i);
            p.pass(i);
            System.out.println("pass方法调用后，i的值为=" + i);
        }

        public void pass(int i) {
            i *= 3;
            System.out.println("pass方法中，i的值为=" + i);
        }
}
