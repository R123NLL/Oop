package oop.Rectangle;

public class Rectangle {
    private int width;
    private int length;

    public Rectangle(int length, int width) {
        this.setLength(length);
        this.setWidth(width);
    }

    public Rectangle() {
        this.setLength(10);
        this.setWidth(10);
    }

    public int getWidth() {
        return width;
    }

    public boolean setWidth(int width) {
        if (width > 0) {
            this.width = width;
            return true;
        } else return false;
    }

    public int getLength() {
        return length;
    }

    public boolean setLength(int length) {
        if (length > 0) {
            this.length = length;
            return true;
        } else return false;
    }

    public int rectanglePerimeter() {
        return (this.getLength() * 2) + (this.getWidth() * 2);
    }

    public int rectangleArea() {
        return this.getWidth() * this.getLength();
    }

}
