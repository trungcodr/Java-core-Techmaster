package Buoi7_Interface_Area;

public class Rectangle implements IPolygon{
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }

    @Override
    public void display() {
        System.out.println(toString());
    }

    @Override
    public void calArea() {
        double area;
        area = length*width;
        System.out.println("Dien tich hcn: " + area );
    }
}
