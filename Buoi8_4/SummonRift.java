package Buoi8_4;

public class SummonRift {
    private Team t1;
    private Team t2;
    private String startTime;

    public SummonRift(Team t1, Team t2, String startTime) {
        this.t1 = t1;
        this.t2 = t2;
        this.startTime = startTime;
    }

    public Team getT1() {
        return t1;
    }

    public void setT1(Team t1) {
        this.t1 = t1;
    }

    public Team getT2() {
        return t2;
    }

    public void setT2(Team t2) {
        this.t2 = t2;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    @Override
    public String toString() {
        return "SummonRift{" +
                "team 1=" + t1 +
                ", team 2=" + t2 +
                ", startTime='" + startTime + '\'' +
                '}';
    }
    public void display(){
        System.out.println(toString());
    }
}
