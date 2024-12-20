package Buoi6;

public abstract class ManagePublicTransport {
    private String nameTransport;
    private final int speedTransport ;

    public ManagePublicTransport(int speedTransport, String nameTransport) {
        this.speedTransport = speedTransport;
        this.nameTransport = nameTransport;
    }

    public String getNameTransport() {
        return nameTransport;
    }

    public void setNameTransport(String nameTransport) {
        this.nameTransport = nameTransport;
    }

    public int getSpeedTransport() {
        return speedTransport;
    }
    public abstract double hour();
    public abstract void display();
}
