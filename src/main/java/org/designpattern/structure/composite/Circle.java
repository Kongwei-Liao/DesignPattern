package org.designpattern.structure.composite;

public class Circle extends Dot{

    private int radius;

    public Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.print("Circle(");
        super.draw();
        System.out.println(", radius = " + radius + ")");
    }
}
