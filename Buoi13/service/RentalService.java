package Buoi13.service;

import Buoi13.entities.Rental;

import java.util.List;
import java.util.Scanner;

public class RentalService implements IService<Rental> {
    @Override
    public Rental add(Scanner scanner) {
        System.out.println("Nhap thong tin thue sach: ");
        System.out.println("Nhap ma khach hang(customerId): ");
        int customerId = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap ma sach muon thue(bookId): ");
        int bookId = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap so luong sach muon thue: ");
        int quantity = Integer.parseInt(scanner.nextLine());

        return new Rental(customerId,bookId,quantity);
    }

    @Override
    public void delete(Scanner scanner, List<Rental> obj) {
        System.out.println("Moi ban nhap id sach thue muon xoa: ");
        int bookId = Integer.parseInt(scanner.nextLine());
        for (Rental rental :  obj){
            if (bookId == rental.getBookId()){
                obj.remove(bookId);
            }
        }
    }

    @Override
    public void update(Scanner scanner, List<Rental> obj) {
        System.out.println("Moi ban nhap id phieu sach thue muon cap nhat: ");
        int id = Integer.parseInt(scanner.nextLine());
        for (Rental rental : obj){
            if (id == rental.getBillId()){
                System.out.println("Moi ban nhap ");
            }
        }
    }
}
