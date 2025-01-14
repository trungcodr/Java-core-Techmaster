package Buoi7;

public class News implements lNews {
    private String title;
    private String author;
    private String publicDate;
    private double rate;

    public News(String title, String author, double rate, String publicDate) {
        this.title = title;
        this.author = author;
        this.rate = rate;
        this.publicDate = publicDate;
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
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Public date: " + publicDate);
        System.out.println("Rate: " + rate);
    }
}
