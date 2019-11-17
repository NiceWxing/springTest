package com.yimi.spring.Proxy.StaticProxy.order;


/**
 * 创建OrderDao持久层操作类
 */
public class OrderDao {
    public int insert(Order order){
        System.out.println("OrderDao 创建 Order 成功！");
        return 1;
    }
}
