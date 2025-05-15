package Buoi13.entities;

import java.time.LocalDate;

public class Rental {
    private int billId;
    private static int autoId;
    private int customerId;
    private int bookId;
    private int quantity;
    private LocalDate rentalDate;

    public Rental( int customerId,int bookId, int quantity) {
        this.billId = ++autoId;
        this.customerId = customerId;
        this.bookId = bookId;
        this.quantity = quantity;
        this.rentalDate = LocalDate.now();
    }

    public int getBillId() {
        return billId;
    }

    public void setBillId(int billId) {
        this.billId = billId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public LocalDate getRentalDate() {
        return rentalDate;
    }

    public void setRentalDate(LocalDate rentalDate) {
        this.rentalDate = rentalDate;
    }

    @Override
    public String toString() {
        return "Rental{" +
                "billId=" + billId +
                ", customerId=" + customerId +
                ", bookId=" + bookId +
                ", quantity=" + quantity +
                ", rentalDate=" + rentalDate +
                '}';
    }
}
