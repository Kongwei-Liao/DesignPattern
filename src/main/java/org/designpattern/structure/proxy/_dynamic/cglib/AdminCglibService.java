package org.designpattern.structure.proxy._dynamic.cglib;

public class AdminCglibService {
    public void update() {
        System.out.println("修改管理系统数据");
    }

    public Object find() {
        System.out.println("查看管理系统数据");
        return new Object();
    }
}