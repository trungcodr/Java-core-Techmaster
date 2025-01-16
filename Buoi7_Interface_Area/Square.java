package Buoi7_Interface_Area;

public class Square implements IPolygon{
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }

    @Override
    public void display() {
        System.out.println(toString());
    }

    @Override
    public void calArea() {
        double area;
        area = side*side;
        System.out.println("Dien tich hinh vuong: " + area);
    }
}
