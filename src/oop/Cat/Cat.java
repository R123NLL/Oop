package oop.Cat;

public class Cat {
    protected String name;
    protected int whiskersLength;
    protected String color;

    protected Cat(String name, int whiskersLength, String color) {
        this.name = name;
        this.whiskersLength = whiskersLength;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWhiskersLength() {
        return whiskersLength;
    }

    public void setWhiskersLength(int whiskersLength) {
        this.whiskersLength = whiskersLength;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return "Cat's name: " + name + " \tWhiskers length: " + whiskersLength + " \tColor: " + color;

    }
}
