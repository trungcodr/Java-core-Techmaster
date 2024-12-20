package Buoi6;

public class AirPlane extends ManagePublicTransport {
    private double distance;

    public AirPlane(int speedTransport, String nameTransport) {
        super(80, "Air Plane");
    }

    @Override
    public double hour() {
        return distance / getSpeedTransport();
    }

    @Override
    public void display() {
        System.out.println("Ten phuong tien: " + getNameTransport());
        System.out.println("Van toc: " + getSpeedTransport());
        System.out.println("Thoi gian den noi: " + hour());
    }
}
