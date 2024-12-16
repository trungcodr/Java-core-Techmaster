package Buoi5_OOP;

public class Employee3 extends Person3 {
    private double exp;

    public Employee3(double exp) {
        this.exp = exp;
    }

    public Employee3(int id, String name, int age, double exp) {
        super(id, name, age);
        this.exp = exp;
    }

    public double getExp() {
        return exp;
    }

    public void setExp(double exp) {
        this.exp = exp;
    }

    @Override
    public String toString() {
        return "Chi tiet thong tin nhan vien: " +
                "id=" + getId()+
                "name=" + getName()+
                "age" + getAge()+
                "exp=" + exp +
                '}';
    }
}
