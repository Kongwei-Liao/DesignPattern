package org.designpattern.structure.adapter;

public class Client {

    public static void main(String[] args) {
        RoundHole roundHole = new RoundHole(5);
        RoundPeg roundPeg = new RoundPeg(5);

        System.out.println(roundHole.fits(roundPeg)); // true

        SquarePeg squarePeg_small = new SquarePeg(5);
        SquarePeg squarePeg_large = new SquarePeg(10);
        // System.out.println(roundHole.fits(squarePeg));  // Compile Error

        SquarePegAdapter squarePegAdapter_small = new SquarePegAdapter(squarePeg_small);
        SquarePegAdapter squarePegAdapter_large = new SquarePegAdapter(squarePeg_large);
        System.out.println(roundHole.fits(squarePegAdapter_small)); // true
        System.out.println(roundHole.fits(squarePegAdapter_large)); // false
    }
}
