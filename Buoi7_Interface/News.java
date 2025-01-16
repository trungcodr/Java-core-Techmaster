package Buoi7_Interface;

public class News implements INews {
    private String title;
    private String author;
    private String publicDate;
    private double rate;

    public News(String title, String author, String publicDate, double rate) {
        this.title = title;
        this.author = author;
        this.publicDate = publicDate;
        this.rate = rate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublicDate() {
        return publicDate;
    }

    public void setPublicDate(String publicDate) {
        this.publicDate = publicDate;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    @Override
    public void display() {
        System.out.println("Tieu de: " + title);
        System.out.println("Tac gia: " + author);
        System.out.println("Ngay cong bo: " + publicDate);
        System.out.println("Danh gia: " + rate);
    }
}
