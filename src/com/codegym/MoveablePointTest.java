package com.codegym;

public class MoveablePointTest {
    public static void main(String[] args) {
        MoveablePoint movePoint = new MoveablePoint();
        System.out.println(movePoint);

        movePoint = new MoveablePoint(4,5);
        System.out.println(movePoint);

        movePoint.move();
        System.out.println(movePoint);

        movePoint.move();
        System.out.println(movePoint);
    }
}
