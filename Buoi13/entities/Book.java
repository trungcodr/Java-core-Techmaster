package Buoi13.entities;

public class Book {
    private int bookId;
    private static int autoId;
    private String title;
    private String author;
    private int quantity;

    public Book( String title, String author,int quantity) {
        this.bookId= ++autoId;
        this.title = title;
        this.author = author;
        this.quantity = quantity;
    }

    public int getId() {
        return bookId;
    }

    public void setId(int id) {
        this.bookId = id;
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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
