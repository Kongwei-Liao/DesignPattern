package org.designpattern.structure.proxy._dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class AdminServiceInvocation  implements InvocationHandler {

    private Object target;

    public AdminServiceInvocation(Object target) {
        this.target = target;
    }

    /**
     * 动态代理的核心方法，通过该方法的实现，jdk来进行对象的动态代理。
     * @param proxy 被代理对象
     * @param method 被代理对象的方法
     * @param args 被代理对象方法的参数列表
     * @return 被代理对象 proxy 的代理对象
     * @throws Throwable 异常
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("判断用户是否有权限进行操作");
        Object obj = method.invoke(target);
        System.out.println("记录用户执行操作的用户信息、更改内容和时间等");
        return obj;
    }
}