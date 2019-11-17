package com.yimi.spring.Proxy.MakeProxy;

import java.lang.reflect.Method;

public interface GPInvocationHandler {
    public Object invoke(Object proxy, Method method,Object[] args)throws Exception;
}
