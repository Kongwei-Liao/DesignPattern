package org.designpattern.structure.proxy._dynamic.cglib;

public class CglibProxyTest {
    public static void main(String[] args) {

        AdminCglibService target = new AdminCglibService();
        AdminServiceCglibProxy proxyFactory = new AdminServiceCglibProxy(target);
        AdminCglibService proxy = (AdminCglibService)proxyFactory.getProxyInstance();

        System.out.println("代理对象：" + proxy.getClass());

        Object obj = proxy.find();
        System.out.println("find 返回对象：" + obj.getClass());
        System.out.println("----------------------------------");
        proxy.update();
    }
}
