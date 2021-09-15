package org.designpattern.createpattern._2_abstractfactory;

public class WinButton implements Button{
    @Override
    public void paint() {
        System.out.println("win button");
    }
}
