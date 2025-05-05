package Buoi8_ArrayList_LOL;

public class Champion {
    private String name;
    private String position;

    public Champion(String name, String position) {
        this.name = name;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Champion{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}
