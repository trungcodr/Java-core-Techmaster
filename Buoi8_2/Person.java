package Buoi8_2;

public class Person {
    private String name;
    private String birthDay;
    private String job;

    public Person(String name, String birthDay, String job) {
        this.name = name;
        this.birthDay = birthDay;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
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
                "name='" + name + '\'' +
                ", birthDay='" + birthDay + '\'' +
                ", job='" + job + '\'' +
                '}';
    }
}
