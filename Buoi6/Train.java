package Buoi6;

public class Train extends ManagePublicTransport {
    private double distance;

    public Train(int speedTransport, String nameTransport) {
        super(40, "Train");
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
