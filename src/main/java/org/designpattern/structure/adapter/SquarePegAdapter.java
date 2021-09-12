package org.designpattern.structure.adapter;

public class SquarePegAdapter extends RoundPeg{

    private SquarePeg squarePeg;  // Attention: Weight Point

    public SquarePegAdapter(SquarePeg squarePeg) {
        this.squarePeg = squarePeg;
    }

    @Override
    public double getRadius(){
        return squarePeg.getWidth() * Math.sqrt(2) / 2;
    }
}
