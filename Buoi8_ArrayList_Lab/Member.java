package Buoi8_ArrayList_Lab;

public class Member {
    private int id;
    private String name;
    private String dob;
    private String job;

    public Member(int id, String name, String dob, String job) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.job = job;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dob='" + dob + '\'' +
                ", job='" + job + '\'' +
                '}';
    }

    public void display(){
        System.out.println(toString());
    }
}
