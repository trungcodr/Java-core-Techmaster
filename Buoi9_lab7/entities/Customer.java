package Buoi9_lab7.entities;

public class Customer {
    private static int autoId;
    private String id;
    private String name;
    private String numHouse;
    private String meterCode;

    public Customer( String name, String numHouse, String meterCode) {
        this.id = "KH" + ++autoId;
        this.name = name;
        this.numHouse = numHouse;
        this.meterCode = meterCode;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumHouse() {
        return numHouse;
    }

    public void setNumHouse(String numHouse) {
        this.numHouse = numHouse;
    }

    public String getMeterCode() {
        return meterCode;
    }

    public void setMeterCode(String meterCode) {
        this.meterCode = meterCode;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", numHouse='" + numHouse + '\'' +
                ", meterCode='" + meterCode + '\'' +
                '}';
    }
}
