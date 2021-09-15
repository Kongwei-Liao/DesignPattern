package org.designpattern.createpattern._2_abstractfactory;

public class MacCheckBox implements CheckBox{
    @Override
    public void paint() {
        System.out.println("mac checkbox");
    }
}
