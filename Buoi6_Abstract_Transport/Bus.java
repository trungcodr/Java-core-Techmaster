package Buoi6_Abstract_Transport;

public class Bus extends Vehicle{


    @Override
    public double calTime(double s) {
        return s/Constaint.V_BUS;
    }



}
