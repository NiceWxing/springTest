package com.yimi.spring.Proxy.StaticProxy;

public class Father {
    private Son son;

    public Father(Son  son){
        this.son = son;
    }

    //获取目标对象的引用
    public void  findLove(){
        System.out.println("父亲物色对象");
        this.son.findLove();
        System.out.println("双方同意交往，确定关系");
    }
}
