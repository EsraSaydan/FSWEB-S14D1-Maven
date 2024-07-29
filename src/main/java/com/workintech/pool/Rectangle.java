package com.workintech.pool;

public class Rectangle {
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width = Math.max(width,0);
        this.length = Math.max(length,0);

    }

    public double getWidth() {
        return width;
    }


    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length < 0 ? 0 : length;
    }

    public double getArea() {
        return this.width*this.length;
    }
}