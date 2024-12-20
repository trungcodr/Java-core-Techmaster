package Buoi6;

public class Bus extends ManagePublicTransport  {
    private double distance;

    public Bus(int speedTransport, String nameTransport, double distance) {
        super(20, "Xe Bus");
        this.distance = distance;
    }



    @Override
    public double hour() {
        return distance / getSpeedTransport();
    }

    @Override
    public void display() {
        System.out.println("Ten phuong tien: " + getNameTransport());
        System.out.println("Van toc: " + getSpeedTransport());
        System.out.println("Thoi gian den noi : " + hour());
    }
}
