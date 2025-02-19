package Buoi8_4;

public class Champion {
    String nameCham;
    String position;

    public Champion(String nameCham, String position) {
        this.nameCham = nameCham;
        this.position = position;
    }

    public String getNameCham() {
        return nameCham;
    }

    public void setNameCham(String nameCham) {
        this.nameCham = nameCham;
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
                "nameCham='" + nameCham + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}
