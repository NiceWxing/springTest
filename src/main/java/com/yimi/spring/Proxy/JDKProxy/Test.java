package com.yimi.spring.Proxy.JDKProxy;

import com.yimi.spring.Proxy.StaticProxy.Person;
import com.yimi.spring.Proxy.StaticProxy.order.IOrderService;
import com.yimi.spring.Proxy.StaticProxy.order.Order;
import com.yimi.spring.Proxy.StaticProxy.order.OrderService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * 使用动态代理实现之后，我们不仅能实现Oder的数据源动态路由，还可以实现其他任何类的数据源路由。
 * 当然，有个比较重要的约定，必须实现getCreateTime（）方法，应为路由规则是根据时间来运算的。我们可以通过接口规范来达到
 * 约束的目的。
 */
public class Test {

    public static void main(String[] args) {
        try {
            Person obj = (Person) new JDKMeipo().getInstance(new Custormer());
            obj.findLove();

            System.out.println("============================================================================================================");
        } catch (Exception e) {
            e.printStackTrace();
        }


        try {
            Order order = new Order();

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
            Date date = sdf.parse("2018/02/01");
            order.setCreateTime(date.getTime());

            IOrderService orderService = (IOrderService) new OrderServiceDynamicProxy().getInstance(new OrderService());
            orderService.createOrder(order);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
