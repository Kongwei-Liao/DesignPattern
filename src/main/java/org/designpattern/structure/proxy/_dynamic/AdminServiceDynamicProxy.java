package org.designpattern.structure.proxy._dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class AdminServiceDynamicProxy {

    private Object target;                          // 被代理对象

    private InvocationHandler invocationHandler;    // 代理增强内容的句柄

    /**
     * 动态代理构造函数，根据InvocationHandler来进行动态代理增强功能
     * @param target
     * @param invocationHandler
     */
    public AdminServiceDynamicProxy(Object target, InvocationHandler invocationHandler){
        this.target = target;
        this.invocationHandler = invocationHandler;
    }

    public Object getPersonProxy() {

        // 根据Handler和被代理对象，动态实例化一个代理对象
        Object obj = Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), invocationHandler);
        return obj;
    }
}