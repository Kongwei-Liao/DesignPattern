package org.designpattern.createpattern._2_abstractfactory;

public class WinCheckBox implements CheckBox{
    @Override
    public void paint() {
        System.out.println("win checkbox");
    }
}
