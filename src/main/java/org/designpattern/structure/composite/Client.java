package org.designpattern.structure.composite;

import java.util.List;

public class Client {
    CompoundGraphic all;

    public void load() {
        all = new CompoundGraphic();
        all.add(new Dot(1, 2));
        all.add(new Circle(1, 2, 3));
    }

    public void groupSelected(List<Graphic> graphicList) {
        CompoundGraphic graphic = new CompoundGraphic();
        for(Graphic graphic1:graphicList) {
            graphic.add(graphic1);
            all.remove(graphic1);
        }
        all.add(graphic);
        all.draw();
    }

    public static void main(String[] args) {
        Client client = new Client();
        client.load();
        client.all.draw();
    }
}
