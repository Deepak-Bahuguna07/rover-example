package com.tw.step.rover.boundary;

import com.tw.step.rover.position.Coordinate;

public class Plateau implements Boundary {
    private Coordinate bottomLeft;
    private Coordinate topRight;

    public void initializeBoundary(Coordinate bottomLeft, Coordinate topRight){
        this.bottomLeft = bottomLeft;
        this.topRight = topRight;
    }

    @Override
    public boolean isWithin(Coordinate coord) {
        return coord.isWithin(bottomLeft, topRight);
    }
}
