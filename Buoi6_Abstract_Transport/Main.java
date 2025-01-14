package Buoi6_Abstract_Transport;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap quan duong ban can di: ");
        double s = Double.parseDouble(scanner.nextLine());

        System.out.println("Thong tin cac phuong tien:");

        Bus bus = new Bus();
        bus.calTime(s);
        System.out.println("Phuong tien: Bus");
        System.out.println("Van toc: " + Constaint.V_BUS + " km/h");
        System.out.println("Thoi gian den noi: "+ bus.calTime(s) + " Gio");
        System.out.println("--------------------------------------------------------");

        Train train = new Train();
        train.calTime(s);
        System.out.println("Phuong tien: Train");
        System.out.println("Van toc: " + Constaint.V_TRAIN + " km/h");
        System.out.println("Thoi gian den noi: " +  train.calTime(s) + " Gio");
        System.out.println("--------------------------------------------------------");

        AirPlane airPlane = new AirPlane();
        airPlane.calTime(s);
        System.out.println("Phuong tien: AirPlane");
        System.out.println("Van toc: " + Constaint.V_PLANE + " km/h");
        System.out.println("Thoi gian den noi: " + airPlane.calTime(s)+ " Gio");
        scanner.close();
    }
}
