package com.tw.step.rover.boundary;

import com.tw.step.rover.position.Coordinate;

public interface Boundary {
    void initializeBoundary(Coordinate topRight, Coordinate bottomLeft);
    boolean isWithin(Coordinate coord);
}
