package org.designpattern.structure.proxy._static;

public class StaticProxyTest {

    public static void main(String[] args) {
        AdminService adminService = new AdminServiceImpl();
        AdminServiceProxy proxy = new AdminServiceProxy(adminService);
        proxy.update();
        System.out.println("=============================");
        proxy.find();
    }
}