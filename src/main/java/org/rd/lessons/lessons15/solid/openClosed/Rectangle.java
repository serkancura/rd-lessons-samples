package org.rd.lessons.lessons15.solid.openClosed;

class Rectangle implements Shape
{
    public double width;
    public double height;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double Area()
    {
        return width * height;
    }
}