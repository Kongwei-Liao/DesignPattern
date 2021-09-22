package org.designpattern.structure.proxy._dynamic.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

// 相当于InvocationHandler
public class AdminServiceCglibProxy implements MethodInterceptor {

    private Object target;

    public AdminServiceCglibProxy(Object target) {
        this.target = target;
    }

    /**
     * 相当于Proxy.newProxyInstance
     * @return
     */
    public Object getProxyInstance() {
        // 工具类
        Enhancer en = new Enhancer();
        // 设置父类
        en.setSuperclass(target.getClass());
        // 设置回调函数
        en.setCallback(this);
        // 创建子类代理对象
        return en.create();
    }

    /**
     * 相当于InvocationHandler的invoke方法
     * @param object
     * @param method
     * @param arg2
     * @param proxy
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object object, Method method, Object[] arg2, MethodProxy proxy) throws Throwable {

        System.out.println("判断用户是否有权限进行操作");
        Object obj = method.invoke(target);
        System.out.println("记录用户执行操作的用户信息、更改内容和时间等");
        return obj;
    }


}