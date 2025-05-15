package Buoi13.entities;

public class Customer {
    private int customerId;
    private static int autoId;
    private String name;
    private String phone;

    public Customer( String name, String phone) {
        this.customerId = ++autoId;
        this.name = name;
        this.phone = phone;
    }

    public int getId() {
        return customerId;
    }

    public void setId(int id) {
        this.customerId = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + customerId +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
