package com.raj.liktest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EquilateralTriangleTest {

    @Test
    void testCalculateArea() {

        EquilateralTriangle triangle =
                new EquilateralTriangle(4);

        assertEquals(6.9282,
                triangle.calculateArea(), 0.0001);
    }

    @Test
    void testCalculateAreaForSideTwo() {

        EquilateralTriangle triangle =
                new EquilateralTriangle(2);

        assertEquals(1.7320,
                triangle.calculateArea(), 0.0001);
    }

    @Test
    void testCalculateAreaForSideFive() {

        EquilateralTriangle triangle =
                new EquilateralTriangle(5);

        assertEquals(10.8253,
                triangle.calculateArea(), 0.0001);
    }
}