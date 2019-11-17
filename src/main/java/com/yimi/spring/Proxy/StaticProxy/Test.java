package com.yimi.spring.Proxy.StaticProxy;

import com.yimi.spring.Proxy.StaticProxy.order.IOrderService;
import com.yimi.spring.Proxy.StaticProxy.order.Order;
import com.yimi.spring.Proxy.StaticProxy.order.OrderService;
import com.yimi.spring.Proxy.StaticProxy.order.OrderServiceStaticProxy;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {


    public static void main(String[] args) {
        //只能帮儿子找对象，不能帮表妹，不能帮陌生人
        Father father =  new Father(new Son());
        father.findLove();

        try {
            Order order = new Order();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
            Date date = sdf.parse("2017/02/01");
            order.setCreateTime(date.getTime());
            IOrderService orderService = new OrderServiceStaticProxy(new OrderService());
            orderService.createOrder(order);

        } catch (ParseException e) {
            e.printStackTrace();
        }


    }



}
