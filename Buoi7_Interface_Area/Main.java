package Buoi7_Interface_Area;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap chieu dai hcn: ");
        double length = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhap chieu rong hcn: ");
        double width = Double.parseDouble(scanner.nextLine());
        Rectangle rectangle = new Rectangle(length,width);


        System.out.println("Nhap canh hinh vuong: ");
        double side = Double.parseDouble(scanner.nextLine());
        Square square = new Square(side);

        rectangle.display();
        rectangle.calArea();
        square.display();
        square.calArea();
    }
}
