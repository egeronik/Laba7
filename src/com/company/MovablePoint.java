package com.company;

public class MovablePoint implements Movable{
    public int x = 0;
    public int y = 0;
    public int xSpeed = 0;
    public int ySpeed = 0;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public void moveUp() {
        x+=xSpeed;
    }

    @Override
    public void moveDown() {
        x-=xSpeed;
    }

    @Override
    public void moveLeft() {
        y-=ySpeed;
    }

    @Override
    public void moveRight() {
        y+=ySpeed;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "x=" + x +
                ", y=" + y +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }
}
