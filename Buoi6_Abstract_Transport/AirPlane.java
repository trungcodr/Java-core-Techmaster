package Buoi6_Abstract_Transport;

public class AirPlane extends Vehicle {


    @Override
    public double calTime(double s) {
        return s/Constaint.V_PLANE;
    }
}
