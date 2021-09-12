package org.designpattern.structure.decorator;

public interface DataSource {
    void writeData(String data);
    String readData();
}
