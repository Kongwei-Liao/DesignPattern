package org.designpattern.createpattern._2_abstractfactory;

public class MacButton implements Button{
    @Override
    public void paint() {
        System.out.println("mac button");
    }
}
