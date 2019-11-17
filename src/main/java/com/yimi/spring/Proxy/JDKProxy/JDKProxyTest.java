package com.yimi.spring.Proxy.JDKProxy;

import com.yimi.spring.Proxy.StaticProxy.Person;
import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;

public class JDKProxyTest {

    public static void main(String[] args) {

        try {
            Person obj = (Person) new JDKMeipo().getInstance(new Custormer());
            obj.findLove();

            //通过反编译工具就可以查看源代码
            byte[] bytes = ProxyGenerator.generateProxyClass("$Proxy0",new Class[]{Person.class});
            FileOutputStream os = new FileOutputStream("E://$Proxy0.class");
            os.write(bytes);
            os.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
