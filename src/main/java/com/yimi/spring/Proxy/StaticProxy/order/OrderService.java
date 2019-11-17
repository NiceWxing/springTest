package com.yimi.spring.Proxy.StaticProxy.order;


/**
 * OrderService实现类
 */
public class OrderService implements IOrderService {

    private OrderDao orderDao;

    public OrderService(){

        //如果使用spring应该是自动注入
        //为了使用方便，我们再构造方法中将orderDao直接初始化
        orderDao = new OrderDao();
    }

    @Override
    public int createOrder(Order order) {
        System.out.println("OrderService调用orderDao创建订单");
        return orderDao.insert(order);
    }
}
