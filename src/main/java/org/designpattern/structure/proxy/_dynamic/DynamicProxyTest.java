package org.designpattern.structure.proxy._dynamic;

import org.designpattern.structure.proxy._static.AdminService;
import org.designpattern.structure.proxy._static.AdminServiceImpl;


import java.lang.reflect.Proxy;

public class DynamicProxyTest {
    public static void main(String[] args) {

        // 方法一：创建被代理类的工厂方法类，调用该类的工厂方法获取代理对象
        System.out.println("============ 方法一 ==============");
        AdminService adminService = new AdminServiceImpl();
        System.out.println("代理的目标对象：" + adminService.getClass());
        AdminServiceInvocation adminServiceInvocation = new AdminServiceInvocation(adminService);
        AdminService proxy = (AdminService) new AdminServiceDynamicProxy(adminService, adminServiceInvocation).getPersonProxy();
        System.out.println("代理对象：" + proxy.getClass());
        Object obj = proxy.find();
        System.out.println("find 返回对象：" + obj.getClass());
        System.out.println("----------------------------------");
        proxy.update();

        // 方法二：直接通过JDK的Proxy实例化被代理对象的代理对象,  请注意newProxyInstance传入的target和invocationHandler传入的adminService并不是同一个对象
        System.out.println("============ 方法二 ==============");
        AdminService target = new AdminServiceImpl();
        AdminServiceInvocation invocation = new AdminServiceInvocation(adminService);
        // 第二个参数必须是接口
        AdminService proxy2 = (AdminService) Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), invocation);

        Object obj2 = proxy2.find();
        System.out.println("find 返回对象：" + obj2.getClass());
        System.out.println("----------------------------------");
        proxy2.update();

        // 方法三：第二种形式的另一种写法，限jdk8版本后，lambda语法糖形式
        System.out.println("============ 方法三 ==============");
        final AdminService target3 = new AdminServiceImpl();
        AdminService proxy3 = (AdminService) Proxy.newProxyInstance(target3.getClass().getClassLoader(), target3.getClass().getInterfaces(), (proxy1, method, args1) -> {
            System.out.println("判断用户是否有权限进行操作");
            Object obj1 = method.invoke(target3, args1);
            System.out.println("记录用户执行操作的用户信息、更改内容和时间等");
            return obj1;
        });

        Object obj3 = proxy3.find();
        System.out.println("find 返回对象：" + obj3.getClass());
        System.out.println("----------------------------------");
        proxy3.update();
    }
}